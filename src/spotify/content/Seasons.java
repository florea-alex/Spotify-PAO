package spotify.content;

import java.util.ArrayList;

public class Seasons extends Episodes {

    public int numberOfEpisodes;
    protected int numberOfSeason;
    protected ArrayList<Episodes> episodes;

    public Seasons(int numberOfEpisodes, int numberOfSeason) {
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeason = numberOfSeason;
        this.episodes = new ArrayList<Episodes>();
    }

    public Seasons() {
        super();
    }

    public Seasons(int numberOfEpisodes, int numberOfSeason, ArrayList<Episodes> episodes) {
        this.numberOfEpisodes = numberOfEpisodes;
        this.numberOfSeason = numberOfSeason;
        this.episodes = new ArrayList<Episodes>(episodes);
    }

    public int getNumberOfEpisodes() {

        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {

        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfSeason() {

        return numberOfSeason;
    }

    public void setNumberOfSeason(int numberOfSeason) {

        this.numberOfSeason = numberOfSeason;
    }

    public ArrayList<Episodes> getEpisodes() {

        return episodes;
    }

    public void addEpisodes(Episodes episode) {

        episodes.add(episode);
    }

    public void prints() {
        System.out.println("From class Seasons {" +
                " the number of episodes is " + numberOfEpisodes +
                ", the number of the current season is " + numberOfSeason +
                ", the episodes are: " ) ;
        for (int i = 0 ; i< episodes.size(); i++){
            System.out.println(episodes.get(i).toString());
        }
        System.out.println("} ");
    }

    //If we want to have access to the below commented methods we should have Seasons extends Episodes
    @Override
    protected void nextEpisode() {
        super.nextEpisode();
        if (this.numberOfEpisodes == this.number){
            this.numberOfSeason++;
        }
    }

    @Override
    public void skip() {
        super.skip();
        if (this.number == this.numberOfEpisodes) {
            System.out.println("Next season.");
            this.numberOfSeason++;
        }
    }

    public void nextSeason() {
        this.numberOfSeason++;
    }

    public Seasons(Seasons seasons_) {
        this.numberOfEpisodes = seasons_.getNumberOfEpisodes();
        this.numberOfSeason = seasons_.getNumberOfSeason();
        this.episodes = new ArrayList<>(seasons_.getEpisodes());
    }
}

