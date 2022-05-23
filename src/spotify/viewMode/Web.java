package spotify.viewMode;

import spotify.premium.Subscriber;
import spotify.content.MyPlaylist;

import java.util.ArrayList;

public class  Web {

    private String language;
    private ArrayList<Subscriber> subscriber;
    private MyPlaylist myPlaylist;

    public Web(String language, ArrayList<Subscriber> subscriberStack, MyPlaylist myPlaylist) {
        this.language = language;
        this.subscriber = new ArrayList<Subscriber>(subscriberStack);
        this.myPlaylist = myPlaylist;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
        System.out.println("From class Web {" +
                " the language is '" + language +
                ", subscriber info: " + subscriber +
                ", my playlist is " + myPlaylist);
        for (int i= 0; i<subscriber.size(); ++i) {
            System.out.println(subscriber.get(i).toString());
        }
        System.out.println("} ");
    }

}
