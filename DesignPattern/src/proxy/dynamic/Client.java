/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:52:33
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 15:16:04
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\dynamic\Client.java
 * 
 * 
 * 如果想让LogProxy可以重用，不仅可以代理RealSubject，还可以代理任何其他可以代理的类型 Object
 * 分离代理行为与被代理对象,使用jdk的动态代理
 * 横切代码与业务逻辑代码分离 AOP,(提取before,after方法)
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 * 
 */
package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //输出动态生成的Proxy类.
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        InvocationHandler handler = new LogProxy(new RealSubject());
        Subject sub = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] { Subject.class },handler);
        sub.request();
    }
}