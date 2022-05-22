package Services;

import Repositories.SongsRepository;
import Spotify.content.Songs;

import java.util.ArrayList;

public class SongsServices {

    private Repositories.SongsRepository SongsRepository = new SongsRepository();

    public ArrayList<Songs> getAllSongs() {
        return SongsRepository.getAllSongs();
    }

    public boolean songAlreadyExisting(String title) {
        Songs Songs = SongsRepository.selectSongs(title);
        if (Songs.getName().length() <= 0) {
            return false;
        }
        return true;
    }

    public void deleteSong(Songs song) {
        SongsRepository.deletesong(song);
        System.out.println("The song was successfully deleted!" );
    }

    public void insertSong(Songs song) {
        SongsRepository.saveSong(song);
        System.out.println("The song was added with success in the database!");
    }
}
