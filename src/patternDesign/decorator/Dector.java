package patternDesign.decorator;

/**
 * Created by crazystone on 17-2-12.
 */
public class Dector implements HumanBeing {

    private HumanBeing humanBeing;
    public Dector(HumanBeing humanBeing){
        this.humanBeing=humanBeing;
    }

    @Override
    public void desc() {
        System.out.println("i am a dector");
        humanBeing.desc();
    }
}
