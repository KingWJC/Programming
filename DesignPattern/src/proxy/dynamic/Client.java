/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:52:33
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 15:16:04
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\dynamic\Client.java
 */
package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = new MyHandler(new RealSubject());
        Subject sub = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] { Subject.class },handler);
        sub.request();
    }
}