
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

    @Override
    public void request() {
        if (proxy != null) {
            System.out.println("request info.");
        } else {
            System.out.println("no proxy.");
        }
    }

    @Override
    public Subject getProxy()
    {
        if(this.proxy==null)
        {
            this.proxy = new ProxySubject(this);
        }
        return this.proxy;
    }
}