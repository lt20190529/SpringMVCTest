package test.InvocationHandlerAndProxy.jdkimpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {

    private Object obj;

    public WorkHandler() {
    }

    public WorkHandler(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====before invoke====");
        Object invoke=method.invoke(obj,args);
        System.out.println("====after invoke====");
        return invoke;
    }
}
