
/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:24
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:52:17
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\force\RealSubject.java
 */
package proxy.force;

public class RealSubject implements Subject {
    Subject proxy;

    public void getProxy() {
        this.proxy = new ProxySubject(this);
    }

    @Override
    public void request() {
        if (proxy != null) {
            proxy.request();
        } else {
            System.out.println("no proxy.");
        }
    }
}