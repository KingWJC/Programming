/*
 * @Author: KingWJC
 * @Date: 2021-05-10 13:52:38
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-10 14:08:32
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\bridge\Bag.java
 */
package bridge;

public abstract class Bag {
    Color color;

    Bag(Color bc) {
        color = bc;
    }

    public abstract void buyBag();
}