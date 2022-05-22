package Repositories;

import Spotify.premium.CreditCard;
import Spotify.premium.Plans;
import Spotify.premium.Subscriber;
import ConnectivityToDatabase.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubscriberRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Subscriber> getAllSubscribers() {
        ArrayList<Subscriber> Subscribers = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from Subscriber where price > 4.5");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Subscriber Subscriber = new Subscriber(rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("emailAddress"),
                        rs.getString("password"),
                        new CreditCard(rs.getInt("cardNumber"),
                                rs.getString("cardEmitter"),
                                rs.getInt("cvv"),
                                rs.getString("ownerName"),
                                rs.getString("fullAddress")),
                        new Plans(rs.getString("description"),
                                rs.getFloat("price"),
                                rs.getInt("numberOfAccounts"),
                                rs.getInt("numberOfDevices")));
                Subscribers.add(Subscriber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Subscribers;
    }
    public Subscriber selectSubscriberDetails(String emailAddress) {
        Subscriber Subscriber = new Subscriber();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from Subscriber");
            statement.setString(1, emailAddress);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Subscriber.setLastName(rs.getString("lastName"));
                Subscriber.setFirstName(rs.getString("firstName"));
                Subscriber.setEmailAddress(rs.getString("emailAddress"));
                Subscriber.setPassword(rs.getString("password"));
                Subscriber.setCreditCard(new CreditCard(rs.getInt("cardNumber"),
                        rs.getString("cardEmitter"),
                        rs.getInt("cvv"),
                        rs.getString("ownerName"),
                        rs.getString("fullAddress")));
                Subscriber.setPlans(new Plans(rs.getString("description"),
                        rs.getFloat("price"),
                        rs.getInt("numberOfAccounts"),
                        rs.getInt("numberOfDevices")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Subscriber;
    }

    public Subscriber selectSubscriber(String emailAddress) {
        Subscriber Subscriber = new Subscriber();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select lastName from Subscriber where emailAddress = ?");
            statement.setString(1, emailAddress);

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Subscriber.setLastName("lastName");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Subscriber;
    }

    public Subscriber selectSubscriber(String emailAddress, String password) {
        Subscriber Subscriber = new Subscriber();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select lastName, firstName" +
                    "emailAddress, password,  cardEmitter, cardNumber, cvv, ownerName, fullAddress" +
                    "description, price, numberOfAccounts, numberOfDevices" +
                    "from Subscriber where fullAddress = ?");
            statement.setString(1, emailAddress);
            statement.setString(2, password);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Subscriber.setEmailAddress(rs.getString(1));
                Subscriber.setLastName(rs.getString(2));
                Subscriber.setFirstName(rs.getString(3));
                Subscriber.setPassword(rs.getString(4));
                Subscriber.setCreditCard(new CreditCard(rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8),
                        rs.getString(9)));
                Subscriber.setPlans(new Plans(rs.getString(10), rs.getFloat(111), rs.getInt(12), rs.getInt(13)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Subscriber;
    }

    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }

    public void saveSubscriber(Subscriber Subscriber) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into Subscriber " +
                    "(lastName, firstName, emailAddress, password,  cardEmitter, cardNumber, cvv, ownerName, fullAddress, country)" +
                    "(description, price, numberOfAccounts, numberOfDevices, resolution)" +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            statement.setString(1, Subscriber.getEmailAddress());
            statement.setString(2, Subscriber.getLastName());
            statement.setString(3, Subscriber.getFirstName());
            statement.setString(4, Subscriber.getPassword());
            statement.setInt(5, Subscriber.getCreditCard().getCardNumber());
            statement.setString(6, Subscriber.getCreditCard().getcardEmitter());
            statement.setInt(7, Subscriber.getCreditCard().getCvv());
            statement.setString(8, Subscriber.getCreditCard().getownerName());
            statement.setString(9, Subscriber.getCreditCard().getfullAddress());
            statement.setString(10, Subscriber.getPlans().getdescription());
            statement.setFloat(11, Subscriber.getPlans().getPrice());
            statement.setInt(12, Subscriber.getPlans().getnumberOfAccounts());
            statement.setInt(13, Subscriber.getPlans().getnumberOfDevices());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSubscriber(Subscriber Subscriber) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from Subscriber where emailAddress = ?");
            statement.setString(1, Subscriber.getEmailAddress());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateSubscriberInfo(Subscriber Subscriber, String lastName, String firstName, String password) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update Subscriber: " +
                    "set lastName = ?, firstName = ?, password = ? where emailAddress = ?");
            statement.setString(4, Subscriber.getEmailAddress());
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(3, password);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
