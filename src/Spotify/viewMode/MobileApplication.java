package Spotify.viewMode;

import Spotify.premium.Subscriber;
import Spotify.content.MyPlaylist;

import java.awt.*;
import java.util.ArrayList;
import java.util.TimerTask;

public class MobileApplication {

    private String language;
    private int numberOfDownloads;
    private ArrayList<Subscriber> subscriber;
    private MyPlaylist myPlaylist;

    public MobileApplication(String language, int numberOfDownloads, ArrayList<Subscriber> Subscriber_, MyPlaylist myPlaylist) {
        this.language = language;
        this.subscriber = new ArrayList<Subscriber>();
        this.numberOfDownloads = numberOfDownloads;
        this.myPlaylist = myPlaylist;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }

    public ArrayList<Subscriber> getSubscriber() {
        return subscriber;
    }

    public void addSubscriber(Subscriber subscriber_) {
        subscriber.add(subscriber_);
    }

    public MyPlaylist getmyPlaylist() {
        return myPlaylist;
    }

    public void setmyPlaylist(MyPlaylist myPlaylist) {
        this.myPlaylist = myPlaylist;
    }

    public void prints(){
        System.out.println("The MobileApplication {" +
                " the language is '" + language + '\'' +
                ", the number of songs and episodes downloaded is " + numberOfDownloads +
                ", subscriber info: " + subscriber +
                ", the playlist is " + myPlaylist);
        for (int i= 0; i < subscriber.size(); i++) {
            System.out.println(subscriber.get(i).toString());
        }
        System.out.print("} ");
    }
}
