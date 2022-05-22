package ConnectivityToDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection;
    Connection connection;

    private DataBaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-spotify-pao?autoReconnect=true&useSSL=false", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {return connection;}

    public static DataBaseConnection getDataBaseConnectionIstance() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnection();
        }
        return dataBaseConnection;
    }
}
//
//public class DataBaseConnection {
//    private static Connection connection;
//
//    private DataBaseConnection() {
//
//    }
//    public static Connection getDataBaseConnectionIstance() throws SQLException {
//        if(connection == null) {
//            String url = "jdbc:mysql://localhost:3306/jdbc-spotify-pao";
//            String userName = "root";
//            String password = "Afiecainelemeu1!";
//
//            connection = DriverManager.getConnection(url, userName, password);
//        }
//        return connection;
//    }
//}