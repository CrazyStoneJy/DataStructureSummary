package patternDesign.observer;

/**
 * Created by crazystone on 17-2-12.
 */
public class Test {
    public static void main(String[] args){
        Subscriber subscriber1 = new Subscriber("jiayan");
        Subscriber subscriber2 = new Subscriber("xiejing");
        Subscriber subscriber3 = new Subscriber("xiongmao");

        NewsPaperStation station = new NewsPaperStation();
        station.addSubscriber(subscriber1);
        station.addSubscriber(subscriber2);
        station.addSubscriber(subscriber3);

        station.removeSubscriber(subscriber3);

        station.pushNotification("zhiboba");
    }

}
