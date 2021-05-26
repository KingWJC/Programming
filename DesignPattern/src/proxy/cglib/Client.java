package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Client {
    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        en.setSuperclass(Tank.class);
        en.setCallback(new TimeMethodIntergerceptor());
        Tank tank = (Tank) en.create();
        tank.move();
    }
}

class TimeMethodIntergerceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before");
        Object result = proxy.invokeSuper(o, args);
        System.out.println("after");
        return result;
    }
}

class Tank {
    public void move() {
        System.out.println("move 50 miters");
    }
}