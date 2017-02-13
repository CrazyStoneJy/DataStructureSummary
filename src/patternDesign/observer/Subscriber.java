package patternDesign.observer;

/**
 * Created by crazystone on 17-2-12.
 */
public class Subscriber implements IReceiver{

    String name;

    public Subscriber(String name){
        this.name=name;
    }

    @Override
    public void receiveNotificatoin(String notification) {
        System.out.println("Hi,"+this.name+", u subscribe "+notification+" coming");
    }
}
