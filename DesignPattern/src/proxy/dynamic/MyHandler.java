/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:52:51
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:55:31
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\dynamic\MyHandler.java
 */
package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    Object obj;

    MyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(obj, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("before info.");
    }

    private void after() {
        System.out.println("after info.");
    }
}