/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:56
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:41:56
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\normal\ProxySubject.java
 */
package proxy.normal;

public class MoveLogProxy implements Movable {
    Movable sub;

    MoveLogProxy(Movable sub) {
        this.sub = sub;
    }

    @Override
    public void move() {
        before();
        if (sub != null) {
            sub.move();
        }
        after();
    }

    private void before()
    {
        System.out.println("start moving....");
    }

    private void after()
    {
        System.out.println("stopped!");
    }
}