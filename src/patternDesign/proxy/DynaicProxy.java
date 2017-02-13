package patternDesign.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by crazystone on 17-2-13.
 */
public class DynaicProxy implements InvocationHandler {
    private Object object;

    public DynaicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(object, args);
        return obj;
    }
}
