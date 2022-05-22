package Repositories;

import Spotify.content.Songs;
import ConnectivityToDatabase.DataBaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SongsRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Songs> getAllSongs() {
        ArrayList<Songs> Songs = new ArrayList<>();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from Songs");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Songs song = new Songs(rs.getString("name"),
                        rs.getString("producer"),
                        rs.getString("lyricsWriter"),
                        rs.getString("genre"),
                        rs.getInt("yearOfRelease"),
                        rs.getString("production"),
                        rs.getInt("duration"),
                        rs.getInt("currentMinute"),
                        rs.getInt("currentSecond"));
                Songs.add(song);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Songs;
    }

    public void saveSong(Songs song) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into Songs " +
                    "(name, producer, lyricsWriter, genre, yearOfRelease, production, duration, currrentMinute, currentSecond) " +
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, song.getName());
            statement.setString(2, song.getproducer());
            statement.setString(3, song.getlyricsWriter());
            statement.setString(4, song.getGenre());
            statement.setInt(5, song.getyearOfRelease());
            statement.setString(6, song.getProduction());
            statement.setInt(7, song.getduration());
            statement.setInt(8, song.getCurrentMinute());
            statement.setInt(9, song.getCurrentSecond());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletesong(Songs song) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from Songs where lyricsWriter = ?");
            statement.setString(1, song.getlyricsWriter());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Songs selectSongs(String title) {
        Songs Songs = new Songs();
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select name from Songs where title = ?");
            statement.setString(1, title);

            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                Songs.setName("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Songs;
    }

}
