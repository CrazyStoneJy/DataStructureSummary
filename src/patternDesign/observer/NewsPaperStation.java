package patternDesign.observer;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 17-2-12.
 */
public class NewsPaperStation implements IObserval {
    private List<IReceiver> subscribers=new ArrayList<>();

    @Override
    public void addSubscriber(IReceiver subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(IReceiver subscriber) {
        if(subscribers.contains(subscriber)){
          subscribers.remove(subscriber);
        }
    }

    @Override
    public void update(String object) {
        for(IReceiver receiver: subscribers){
            receiver.receiveNotificatoin(object);
        }
    }

    public void pushNotification(String message){
        update(message);
    }

}
