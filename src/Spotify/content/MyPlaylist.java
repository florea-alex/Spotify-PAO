package Spotify.content;

import java.util.ArrayList;

public class MyPlaylist {

    private ArrayList<Songs> songs;
    private ArrayList<Podcasts> podcasts;

    public MyPlaylist(ArrayList<Songs> songs, ArrayList<Podcasts> podcasts) {
        this.songs = new ArrayList<>(songs);
        this.podcasts = new ArrayList<>(podcasts);
    }

    public MyPlaylist(MyPlaylist myList_) {
        this.songs = new ArrayList<>(myList_.songs);
        this.podcasts = new ArrayList<>(myList_.podcasts);
    }

    public MyPlaylist() {

    }

    public ArrayList<Songs> getsongs() {
        return songs;

    }

    public void setsongs(ArrayList<Songs> songs) {
        this.songs = songs;
    }

    public ArrayList<Podcasts> getpodcasts() {
        return podcasts;
    }

    public void setpodcasts(ArrayList<Podcasts> podcasts) {
        this.podcasts = podcasts;
    }

    public void addsongs(Songs song) {
        songs.add(song);
    }

    public void addpodcasts(Podcasts podcasts_) {
        podcasts.add(podcasts_);
    }

    @Override
    public String toString() {
        return "From class MyPlaylist { " +
                " the songs are " + songs +
                ", the podcasts are " + podcasts +
                "} ";
    }

    public void viewDetails() {
        System.out.println("songs: ");
        for (int i = 0 ; i < songs.size(); i++) {
            System.out.println(songs.get(i).toString());
        }

        System.out.println("podcasts: ");
        for (int i = 0; i < podcasts.size(); i++){
            podcasts.get(i).prints();
        }
    }
}