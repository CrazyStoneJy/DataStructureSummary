package patternDesign.proxy;

/**
 * Created by crazystone on 17-2-13.
 */
public class Lawyer implements ILawsuit {

    private ILawsuit iLawsuit;

    public Lawyer(ILawsuit iLawsuit) {
        this.iLawsuit = iLawsuit;
    }


    @Override
    public void submit() {
        this.iLawsuit.submit();
    }

    @Override
    public void burden() {
        this.iLawsuit.burden();
    }

    @Override
    public void defend() {
        this.iLawsuit.defend();
    }

    @Override
    public void finish() {
        this.iLawsuit.finish();
    }
}
