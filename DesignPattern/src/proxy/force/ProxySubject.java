/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:56
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:41:56
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\force\ProxySubject.java
 */
package proxy.force;

public class ProxySubject implements Subject {
    Subject sub;

    ProxySubject(Subject sub) {
        this.sub = sub;
    }

    @Override
    public void request() {
        before();
        if (sub != null) {
            sub.request();
        }
        after();
    }

    @Override
    public Subject getProxy()
    {
        return this;
    }

    private void before()
    {
        System.out.println("before info.");
    }

    private void after()
    {
        System.out.println("after info.");
    }
}