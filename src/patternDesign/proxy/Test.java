package patternDesign.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by crazystone on 17-2-13.
 */
public class Test {

    public static void main(String[] args){
        ILawsuit xiaoMin = new XiaoMin();
        Lawyer lawyer = new Lawyer(xiaoMin);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
        System.out.println(">>>>>>>>>>>>>>>>>");

        ILawsuit iLawsuit  = new XiaoMin();
        DynaicProxy proxy = new DynaicProxy(xiaoMin);
        ILawsuit lawyerProxy = (ILawsuit) Proxy.newProxyInstance(iLawsuit.getClass().getClassLoader(),new Class[]{ILawsuit.class},proxy);
        lawyerProxy.submit();
        lawyerProxy.burden();
        lawyerProxy.defend();
        lawyerProxy.finish();
    }

}
