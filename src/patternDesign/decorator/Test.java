package patternDesign.decorator;

/**
 * Created by crazystone on 17-2-12.
 */
public class Test {

    public static void main(String[] args){

        HumanBeing humanBeing = new SpiderMan(new Dector(new CommonPerson()));
        humanBeing.desc();

    }


}
