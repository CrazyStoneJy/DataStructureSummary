package patternDesign.decorator;

/**
 * Created by crazystone on 17-2-12.
 */
public class SpiderMan implements HumanBeing{

    private HumanBeing humanBeing;
    public SpiderMan(HumanBeing humanBeing){
        this.humanBeing=humanBeing;
    }

    @Override
    public void desc() {
        System.out.println("I am a spider man");
        humanBeing.desc();
    }
}
