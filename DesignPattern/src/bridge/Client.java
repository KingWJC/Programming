/*
 * @Author: KingWJC
 * @Date: 2021-05-10 13:33:23
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-10 14:37:06
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\bridge\Client.java
 */
package bridge;

public class Client {
    public static void main(String[] args) {
        Color blue = new ColorBlue();
        Color black = new ColorBlack();

        Bag bagpackBlue = new BagPack(blue);
        bagpackBlue.buyBag();

        Bag bagpackBlack = new BagPack(black);
        bagpackBlack.buyBag();

        Bag bagwalletBlue = new BagWallet(blue);
        bagwalletBlue.buyBag();
    }
}
