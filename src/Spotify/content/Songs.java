package Spotify.content;

public class Songs extends Commands{

    private String name;
    private String producer;
    private String lyricsWriter;
    private String genre;
    private int yearOfRelease;
    private String production;

    public Songs() {
    }
    
    public Songs(String name, String producer, String lyricsWriter, String genre,
                 int yearOfRelease, String production,
                 int numberOfMinutes, int currentMinute, int currentSecond) {
        super(numberOfMinutes, currentMinute, currentSecond);
        this.name = name;
        this.producer = producer;
        this.lyricsWriter = lyricsWriter;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.production = production;
    }

    public Songs(Songs songsData) {
        this.producer = songsData.producer;
        this.name = songsData.name;
        this.lyricsWriter = songsData.lyricsWriter;
        this.genre = songsData.genre;
        this.yearOfRelease = songsData.yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getproducer() {
        return producer;
    }

    public void setproducer(String producer) {
        this.producer = producer;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }


    public String getlyricsWriter() {
        return lyricsWriter;
    }

    public void setlyricsWriter(String lyricsWriter) {
        this.lyricsWriter = lyricsWriter;
    }

    public int getyearOfRelease() {
        return yearOfRelease;
    }

    public void setyearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "From class Songs {" +
                " the name of the song is '" + name + '\'' +
                ", the producer is '" + producer + '\'' +
                ", the lyrics writer is '" + lyricsWriter + '\'' +
                ", the main genre is '" + lyricsWriter + '\'' +
                ", the year of release is '" + yearOfRelease + '\'' +
                ", the production is '" + production + '\'' +
                "} " + super.toString();
    }

    @Override
    public void skip() {
        super.skip();
        if (this.currentMinute == this.duration) {
            System.out.println("Lyrics are written by " + this.lyricsWriter + '\'' +
                    "produced by " + this.producer + " released in "+ this.yearOfRelease + '\'');
        }
    }

    @Override
    public void back() {
        super.back();
        if (this.currentMinute == 0) {
            System.out.println("You are listening to " + this.name + "written by " +
                    this.lyricsWriter + '\'' + "produced by " + this.producer +
                    " released in "+ this.yearOfRelease + '\'');
        }
    }
}
