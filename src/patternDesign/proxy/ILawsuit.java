package patternDesign.proxy;

/**
 * Created by crazystone on 17-2-13.
 */
public interface ILawsuit {

    //提交
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();

}
