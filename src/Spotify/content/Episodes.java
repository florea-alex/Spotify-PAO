package Spotify.content;

public class Episodes extends Commands{

    private int id;
    protected int number;
    protected String name;

    public Episodes() {

        super();
    }

    public Episodes(int number, String name, int duration,
                    int currentMinute, int currentSecond) {
        super(duration, currentMinute, currentSecond);
        this.number = number;
        this.name = name;
    }

    public Episodes(Episodes episodesData) {
        this.number = episodesData.number;
        this.name = episodesData.name;
        this.duration = episodesData.duration;
        this.currentSecond = episodesData.currentSecond;
        this.currentMinute = episodesData.currentMinute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void nextEpisode() {

        ++this.number;
    }

    protected void previousEpisode() {
        if (this.number > 1)    
            --this.number;
    }
    @Override
    public void skip() {
        super.skip();
        if (this.currentMinute == this.duration) {
            System.out.println("You chose to skip to the next episode of the podcast.");
        }
    }

    @Override
    public void back() {
        super.back();
        if (this.currentMinute == 0) {
            System.out.println("You are at the beginning of the current episode.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "From class Episodes {" +
                " the number of the episode is '" + number +
                ", the name of the episode is '" + name + '\'' +
                "} ";
    }
}

