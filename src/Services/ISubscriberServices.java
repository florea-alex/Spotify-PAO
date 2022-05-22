package Repositories;

import Spotify.premium.Subscriber;

public interface ISubscriberServices {
    public boolean  login(String email, String password);

    public void register(Subscriber subscriber);
}
