
/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:24
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 15:20:58
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\normal\Tank.java
 */
package proxy.normal;

import java.util.Random;

public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("move a while.");
        try {
            Thread.sleep(new Random().nextInt(300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}