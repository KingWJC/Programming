package factorymethod.staticfactory;

import factorymethod.product.BlackPeople;
import factorymethod.product.Human;
import factorymethod.product.WhitePeople;
import factorymethod.product.YellowPeople;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:04:17
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:27:17
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\factory\StaticFactory.java
 */
public class StaticFactory {
    public static Human createHuman(String colorType) {
        switch (colorType) {
        case "Yello":
            return new YellowPeople();
        case "White":
            return new WhitePeople();
        case "Black":
            return new BlackPeople();
        default:
            return null;
        }
    }
}
