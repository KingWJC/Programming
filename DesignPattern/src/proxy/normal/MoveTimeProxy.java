/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:56
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:41:56
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\normal\ProxySubject.java
 */
package proxy.normal;

public class MoveTimeProxy implements Movable {
    Movable sub;

    MoveTimeProxy(Movable sub) {
        this.sub = sub;
    }

    @Override
    public void move() {
        long time = before();
        if (sub != null) {
            sub.move();
        }
        after(time);
    }

    private long before() {
        return System.currentTimeMillis();
    }

    private void after(long begin) {
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}