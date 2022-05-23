package spotify.content;

import java.util.ArrayList;

public class Podcasts extends Seasons {

    private String title;
    private String speaker;
    private String writer;
    private String genre;
    protected int numberOfSeasons;
    protected ArrayList<Seasons> seasons;

    public Podcasts(String title, String speaker, String writer, String genre, int numberOfSeasons) {
        this.title = title;
        this.speaker = speaker;
        this.writer = writer;
        this.genre = genre;
        this.numberOfSeasons = numberOfSeasons;
        this.seasons = new ArrayList<Seasons>();
    }

    public Podcasts() {
    }


    public Podcasts(String title, String speaker, String writer, String genre, int numberOfSeasons, ArrayList<Seasons> seasons) {
        this.title = title;
        this.speaker = speaker;
        this.writer = writer;
        this.genre = genre;
        this.numberOfSeasons = numberOfSeasons;
        this.seasons = new ArrayList<Seasons>(seasons);
    }

    public void addSeasons(Seasons seasons_) {
        seasons.add(seasons_);
    }

    public String gettitleOfpodcasts() {
        return title;
    }

    public void settitleForpodcasts(String title) {
        this.title = title;
    }

    public String getspeaker() {
        return speaker;
    }

    public void setspeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getgenre() {
        return genre;
    }

    public void setgenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public ArrayList<Seasons> getSeason() {
        return seasons;
    }


    //If we want to have the below methos, clas Podcast should extend Seasons
    public String toString() {
        return super.toString() + "From class Podcasts {" +
                " the title is '" + title + '\'' +
                ", the speaker is '" + speaker + '\'' +
                ", the writer is '" + writer + '\'' +
                ", the genre is '" + genre + '\'' +
                ", the number of seasons is " + numberOfSeasons +
                "} ";
    }

    @Override
    public void prints() {
        super.prints();
        System.out.println("Podcasts {" +
                " the title is '" + title + '\'' +
                ", the speaker is '" + speaker + '\'' +
                ", the writer is '" + writer + '\'' +
                ", the genre is '" + genre + '\'' +
                ", the numberOfSeasons is " + numberOfSeasons);
        for (int i = 0; i < seasons.size(); i++) {
            Seasons seasons_ = new Seasons(seasons.get(i));
            seasons_.prints();
        }
    }

    @Override
    public void skip() {
        super.skip();
        if (this.numberOfSeasons == this.numberOfSeason) {
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.speaker + '\'' +
                    "The end.");
        }
    }

    @Override
    public void nextSeason() {
        super.nextSeason();
        if (this.numberOfSeasons == this.numberOfSeason) {
            System.out.println("Written by " + this.writer + '\'' +
                    "Directed by " + this.speaker + '\'' +
                    "The end.");
        }
    }

    public Podcasts(Podcasts podcastsData_) {
        this.title = podcastsData_.gettitleOfpodcasts();
        this.speaker = podcastsData_.getspeaker();
        this.writer = podcastsData_.getWriter();
        this.genre = podcastsData_.getgenre();
        this.numberOfSeasons = podcastsData_.getNumberOfSeasons();
        this.seasons = new ArrayList<>(podcastsData_.getSeason());
    }
}
