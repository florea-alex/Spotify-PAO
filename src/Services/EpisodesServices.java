package Services;

import Repositories.EpisodesRepository;
import Spotify.content.Episodes;
import Spotify.content.Songs;

import java.util.ArrayList;
import java.util.Map;

public class EpisodesServices {

    private Repositories.EpisodesRepository EpisodesRepository = new EpisodesRepository();
    
    public Map<Integer, Episodes> getAllEpisodesAsMap() {
        return EpisodesRepository.getAllEpisodesAsMap();
    }

    public ArrayList<Episodes> getAllEpisodes() {
        return EpisodesRepository.getAllEpisodes();
    }

    public void addNewEpisode(Episodes episode) {
        EpisodesRepository.saveepisode(episode);
        System.out.println("The episode you requested was added successfully!");
    }

    public void updateEpisode(Episodes episode, int newNumber) {
        EpisodesRepository.updateEpisodeInfo(episode, newNumber);
        System.out.println("The episode "+ newNumber + " was updated!");
    }

    public void deleteEpisodeByTitle(Episodes episode, String episodeToDelete) {
        EpisodesRepository.deleteEpisodeByTitle(episode, episodeToDelete);
        System.out.println("The episode " + episodeToDelete + " was successfully deleted!" );
    }

    public void deleteEpisode(Episodes episode) {
        EpisodesRepository.deleteEpisode(episode);
        System.out.println("The episode was successfully deleted!" );
    }
}
