package spotify.content;

import java.util.ArrayList;

public class Albums {

    private String title;
    private String mainProducer;
    private String artistName;
    private String mainGenre;
    private String studioName;
    private int numberOfSongs;
    private ArrayList<Songs> Songs;

    public Albums() {
    }

    public Albums(String title, String mainProducer, String artistName, String mainGenre,
                  String studioName, int numberOfSongs) {
        this.title = title;
        this.mainProducer = mainProducer;
        this.artistName = artistName;
        this.studioName = studioName;
        this.mainGenre = mainGenre;
        this.numberOfSongs = numberOfSongs;
        this.Songs = new ArrayList<Songs>();
    }

    public Albums(String title, String mainProducer, String artistName, String mainGenre,
                  String studioName, int numberOfSongs, ArrayList<Songs> Songs) {
        this.title = title;
        this.mainProducer = mainProducer;
        this.artistName = artistName;
        this.studioName = studioName;
        this.mainGenre = mainGenre;
        this.numberOfSongs = numberOfSongs;
        this.Songs = new ArrayList<Songs>();
    }

    public void addSongs(Songs song) {
        Songs.add(song);
    }

    public String gettitleOfAlbums() {
        return title;
    }

    public void settitleForAlbums(String title) {
        this.title = title;
    }

    public String getmainProducer() {
        return mainProducer;
    }

    public void setmainProducer(String mainProducer) {
        this.mainProducer = mainProducer;
    }

    public String getMainGenre() {
        return mainGenre;
    }

    public void setMainGenre(String mainGenre) {
        this.mainGenre = mainGenre;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.artistName = artistName;
    }

    public String getartistName() {
        return artistName;
    }

    public void setartistName(String artistName) {
        this.artistName = artistName;
    }

    public int getnumberOfSongs() {
        return numberOfSongs;
    }

    public void setnumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public ArrayList<Songs> getSongs() {
        return Songs;
    }


    public void prints() {
        System.out.println("From class Albums {" +
                " the title is '" + title +
                ", the main producer is '" + mainProducer +
                ", the artist is '" + artistName +
                ", the number of songs is " + numberOfSongs + " & the Songs are: ");
        for (int i = 0; i < Songs.size(); ++i) {
            System.out.println(Songs.get(i).toString());
        }
        System.out.println("} ");
    }

    //If we want to have the below methods, then class Albums should extend Songs
//    @Override
//    public void skip() {
//        super.skip();
//
//    }
//
//    @Override
//    public void back() {
//        super.back();
//        if (this.currentMinute == 0) {
//            System.out.println("Currently playing " + this.title + " by " + '\'' +
//                    this.title + '\'');
//        }
//    }
//
//    @Override
//    public void pause() {
//
//        super.pause();
//    }
//
//    @Override
//    public void resume() {
//
//        super.resume();
//    }
}
