package spotify.viewMode;

import spotify.premium.Subscriber;
import spotify.content.MyPlaylist;

import java.util.ArrayList;

public class DesktopApplication {

    private String language;
    private String location;
    private ArrayList<Subscriber> subscriber;
    private MyPlaylist myPlaylist;
    private double sound = 100.0;

    public DesktopApplication(String language, String location, ArrayList<Subscriber> subscriber_,
                               MyPlaylist myPlaylist) {
        this.language = language;
        this.location = location;
        this.subscriber = new ArrayList<Subscriber>(subscriber_);
        this.myPlaylist = myPlaylist;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    
    public double getSound() {
        return sound;
    }
    
    public void setSound(double sound) {
        this.sound = sound;
    }

    public void view() {
        System.out.println("From the DesktopApplication {" +
                " the language is '" + language +
                ", the location is '" + location +
                ", the sound is at " + sound +
                ", the Subscribers are: ");
        for (int i = 0; i < subscriber.size(); i++){
            System.out.println(subscriber.get(i).toString());
        }
        System.out.println(", my playlist is " + myPlaylist.toString() +
                ", the sound is at '" + sound + '\'' +
                "} ");
    }

    public void prints(){
        System.out.println("DesktopApplication {" +
                " the language is '" + language + '\'' +
                ", the location is '" + location + '\'' +
                ", the Subscriber is " + subscriber +
                ", the myPlaylist is " + myPlaylist);
        for (int i= 0; i < subscriber.size(); i++) {
            System.out.println(subscriber.get(i).toString());
        }
    }
}
