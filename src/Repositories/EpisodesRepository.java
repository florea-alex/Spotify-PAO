package Repositories;

import Spotify.content.Episodes;
import ConnectivityToDatabase.DataBaseConnection;
import Spotify.content.Songs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

public class EpisodesRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Episodes> getAllEpisodes() {
        ArrayList<Episodes> Episodes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from Episodes");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Episodes episode = new Episodes(rs.getInt("number"),
                        rs.getString("name"),
                        rs.getInt("duration"),
                        rs.getInt("currentMinute"),
                        rs.getInt("currentSecond"));
                Episodes.add(episode);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Episodes;
    }

    public Map<Integer, Episodes> getAllEpisodesAsMap() {
        Map map = new HashMap<Integer, Episodes>();
        String query = "select * from Episodes";
        try{
            PreparedStatement preparedStatement = connection.getConnection().prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Episodes Episodes = new Episodes();
                int id = rs.getInt(1);
                Episodes.setId(id);
                Episodes.setNumber(rs.getInt(2));
                Episodes.setName(rs.getString(3));
                Episodes.setduration(rs.getInt(4));
                Episodes.setCurrentMinute(rs.getInt(5));
                Episodes.setCurrentSecond(rs.getInt(6));
                map.put(id, Episodes);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return map;
    }

    public void saveepisode(Episodes episode) { //Insert
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into Episodes " +
                    "(number, name, duration, currrentMinute, currentSecond) " +
                    "values(?, ?, ?, ?, ?)");
            statement.setInt(1, episode.getNumber());
            statement.setString(2, episode.getName());
            statement.setInt(3, episode.getduration());
            statement.setInt(4, episode.getCurrentMinute());
            statement.setInt(5, episode.getCurrentSecond());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEpisodeByTitle(Episodes episode, String episodeName) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from Episodes where name = ?");
            statement.setString(1, episodeName);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEpisode(Episodes episode) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from Episodes where name = ?");
            statement.setString(1, episode.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateEpisodeInfo(Episodes episode, int number) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update Episodes: " +
                    "set number = ? where name LIKE '%a'");
            statement.setString(2, episode.getName());
            statement.setInt(1, number);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
