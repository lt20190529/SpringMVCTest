package test.InvocationHandlerAndProxy.jdkimpl;


import com.lt.config.Global;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class InvocationHandlerTest {

    @Test
    public void test1(){
        People people=new Teacher();
        People people1=new farmers();
        InvocationHandler handler=new WorkHandler(people);
        InvocationHandler handler1=new WorkHandler(people1);

        People proxy = (People) Proxy.newProxyInstance(handler.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        People proxy1 = (People) Proxy.newProxyInstance(handler1.getClass().getClassLoader(), people1.getClass().getInterfaces(), handler1);

        System.out.println(proxy.toString());
        System.out.println(proxy.Work());
        System.out.println("******************************************************");
        System.out.println(proxy1.Work());
    }

    //Global测试
    @Test
    public void test2(){
        System.out.println(Global.getConfig("web.DSAFASF"));

    }
}
