/*
 * @Author: KingWJC
 * @Date: 2021-05-27 10:46:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-27 15:49:49
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\cglib\Client.java
 * 
 * 运行错误：java.lang.NoClassDefFoundError。
 * 原因：很多java字节码操作和分析的第三方类库都引用了asm.jar文件
 * 
 */

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
        System.out.println(o.getClass().getName());
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