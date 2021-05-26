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
    Colorable color;

    Bag(Colorable bc) {
        color = bc;
    }

    public abstract void buyBag();
}