package patternDesign.decorator;

/**
 * Created by crazystone on 17-2-12.
 */
public class CommonPerson implements HumanBeing {


    @Override
    public void desc() {
        System.out.println("i am person");
    }
}
