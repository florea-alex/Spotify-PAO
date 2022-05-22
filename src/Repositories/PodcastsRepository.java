package Repositories;

import Spotify.content.Episodes;
import Spotify.content.Podcasts;
import Spotify.content.Seasons;
import ConnectivityToDatabase.DataBaseConnection;

import java.util.ArrayList;
import java.util.Collections;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PodcastsRepository {
    private DataBaseConnection connection = DataBaseConnection.getDataBaseConnectionIstance();

    public ArrayList<Podcasts> getAllPodcasts() {
        ArrayList<Podcasts> Podcasts = new ArrayList<>();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("select * from Podcasts");

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Podcasts Podcasts_ = new Podcasts(rs.getString("title"),
                        rs.getString("speaker"),
                        rs.getString("writer"),
                        rs.getString("genre"),
                        rs.getInt("numberOfSeasons"),
                        new ArrayList<Seasons> (Collections.singleton(new Seasons(rs.getInt("numberOfEpisodes"),
                                rs.getInt("numberOfSeasons"),
                                new ArrayList<Episodes> (Collections.singleton(new Episodes(rs.getInt("episode"),
                                        rs.getString("name"),
                                                rs.getInt("duration"),
                                        rs.getInt("currentMinute"),
                                        rs.getInt("currentSecond"))))))));

                Podcasts.add(Podcasts_);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Podcasts;
    }

    public void savePodcasts(Podcasts Podcasts) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("insert into Podcasts " +
                    "(title, speaker, writer, genre, numberOfSeasons)," + //Podcasts
                    "(numberOfEpisodes, numberOfSeason)" + //Seasons
                    "(number, name, duration, currentMinute, currentSecond)" + //Episodes -> Commands
                    "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, Podcasts.gettitleOfpodcasts());
            statement.setString(2, Podcasts.getspeaker());
            statement.setString(3, Podcasts.getWriter());
            statement.setString(4, Podcasts.getgenre());
            statement.setInt(5, Podcasts.getNumberOfSeasons());
            statement.setInt(6, Podcasts.getNumberOfEpisodes());
            statement.setInt(7, Podcasts.getNumberOfSeason());
            statement.setInt(8, Podcasts.getNumber());
            statement.setString(9, Podcasts.getName());
            statement.setInt(10, Podcasts.getduration());
            statement.setFloat(11, Podcasts.getCurrentMinute());
            statement.setFloat(12, Podcasts.getCurrentSecond());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePodcastsNumberOfSeasons(Seasons seasons, String title, int newNumberOfSeasonsAdded, int newNumberOfEpisodesAdded) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("update numberOfSeasons = ? and " +
                    "(numberOfEpisodes, numberOfSeason)" +
                    " for Podcasts where title = ?");
            statement.setString(4, title);
            statement.setInt(1, seasons.getNumberOfSeason() + newNumberOfSeasonsAdded);
            statement.setInt(2, seasons.getNumberOfEpisodes() + newNumberOfEpisodesAdded);
            statement.setInt(3, seasons.getNumberOfSeason());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePodcasts(Podcasts podcast) {
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("delete from Podcasts where title = ?");
            statement.setString(1, podcast.gettitleOfpodcasts());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
