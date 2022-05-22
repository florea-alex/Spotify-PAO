package Services;

import Repositories.ISubscriberServices;
import Spotify.premium.Subscriber;
import Repositories.SubscriberRepository;

import java.util.ArrayList;

public class SubscriberServices implements ISubscriberServices {
    private SubscriberRepository SubscriberRepository = new SubscriberRepository();
    
    public ArrayList<Subscriber> getAllSubscribers() {
        return SubscriberRepository.getAllSubscribers();
    }

    @Override
    public void register(Subscriber subscriber) {

        SubscriberRepository.saveSubscriber(subscriber);
    }

    @Override
    public boolean login(String email, String password) {
        Subscriber Subscriber = SubscriberRepository.selectSubscriber(email, password);
        if (Subscriber.getFirstName() != null) {
            return true;
        }
        return false;
    }

    public boolean accountAlreadyExisting(String email) {
        Subscriber Subscriber = SubscriberRepository.selectSubscriber(email);
        if (Subscriber.getEmailAddress().length() <= 0) {
            return false;
        }
        return true;
    }

}
