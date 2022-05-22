package Services;

import Repositories.PodcastsRepository;
import Spotify.content.Podcasts;
import Spotify.content.Podcasts;

import java.util.ArrayList;

public class PodcastsServices {

    private Repositories.PodcastsRepository PodcastsRepository = new PodcastsRepository();

    public ArrayList<Podcasts> getAllPodcasts() {
        return PodcastsRepository.getAllPodcasts();
    }

    public void updatePodcast(Podcasts podcast, String newTitle, int noOfSeasons, int noOfEp) {
        PodcastsRepository.updatePodcastsNumberOfSeasons(podcast, newTitle, noOfSeasons, noOfEp);
        System.out.println("The podcast "+ newTitle + " was updated with the numbers entered!");
    }

    public void deletePodcast(Podcasts podcast) {
        PodcastsRepository.deletePodcasts(podcast);
        System.out.println("The podcast was successfully removed!" );
    }

    public void insertPodcast(Podcasts podcast) {
        PodcastsRepository.savePodcasts(podcast);
        System.out.println("The podcast was inserted with success in the database!");
    }
    
}
