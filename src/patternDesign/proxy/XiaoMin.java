package patternDesign.proxy;

/**
 * Created by crazystone on 17-2-13.
 */
public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("提交申请");
    }

    @Override
    public void burden() {
        System.out.println("进行举证");
    }

    @Override
    public void defend() {
        System.out.println("开始辩护");
    }

    @Override
    public void finish() {
        System.out.println("诉讼完成");
    }
}
