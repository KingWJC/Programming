/*
 * @Author: KingWJC
 * @Date: 2021-05-10 13:33:23
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 11:51:57
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\bridge\Client.java
 * 
 * 分离抽象与具体实现，让他们可以独自发展
 * Bag -> Pack Wallet
 * BagColor -> Blue Black Red
 * 
 */
package bridge;

public class Client {
    public static void main(String[] args) {
        Colorable blue = new ColorBlue();
        Colorable black = new ColorBlack();

        Bag bagpackBlue = new BagPack(blue);
        bagpackBlue.buyBag();

        Bag bagpackBlack = new BagPack(black);
        bagpackBlack.buyBag();

        Bag bagwalletBlue = new BagWallet(blue);
        bagwalletBlue.buyBag();
    }
}
