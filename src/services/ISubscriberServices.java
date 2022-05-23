package repositories;

import spotify.premium.Subscriber;

public interface ISubscriberServices {
    public boolean  login(String email, String password);

    public void register(Subscriber subscriber);
}
