package patternDesign.observer;

import org.omg.CORBA.Object;

/**
 * 被观察者（被订阅者）所具有的功能
 * 1：能够被订阅者订阅
 * 2：能够被订阅者取消订阅
 * 3：通知订阅者有东西更新
 * Created by crazystone on 17-2-12.
 */
public interface IObserval {

    void addSubscriber(IReceiver subscriber);

    void removeSubscriber(IReceiver subscriber);

    void update(String object);

}
