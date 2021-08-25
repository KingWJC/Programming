/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:52:51
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-08-25 16:13:35
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\dynamic\LogHandler.java
 */
package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    Object obj;

    LogHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * @description: proxy动态生成的代理对象，method可以用来指定方法
     * @param {*}
     * @return {*}
     */    
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