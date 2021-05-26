/*
 * @Author: KingWJC
 * @Date: 2021-05-10 13:57:46
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-10 14:04:59
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\bridge\BagWallet.java
 */
package bridge;

public class BagWallet extends Bag {
    BagWallet(Colorable bc) {
        super(bc);
    }

    @Override
    public void buyBag() {
        System.out.println(color.getColor() + " wallet");
    };
}