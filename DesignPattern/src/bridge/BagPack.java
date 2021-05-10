/*
 * @Author: KingWJC
 * @Date: 2021-05-10 13:56:51
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-10 14:08:46
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\bridge\BagPack.java
 */
package bridge;

public class BagPack extends Bag {
    BagPack(Color color) {
        super(color);
    }

    @Override
    public void buyBag() {
        System.out.println(color.getColor()+" backpack");
    };
}