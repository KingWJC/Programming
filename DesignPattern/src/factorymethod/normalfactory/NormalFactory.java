package factorymethod.normalfactory;
/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:04:36
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:42:43
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\factory\NormalFactory.java
 */

import factorymethod.product.BlackPeople;
import factorymethod.product.Human;
import factorymethod.product.WhitePeople;
import factorymethod.product.YellowPeople;

public interface NormalFactory {
    Human createHuman();
}

class YelloFactory implements NormalFactory {
    @Override
    public Human createHuman() {
        return new YellowPeople();
    }
}

class BlackFactory implements NormalFactory {
    @Override
    public Human createHuman() {
        return new BlackPeople();
    }
}

class WhiteFactory implements NormalFactory {
    @Override
    public Human createHuman() {
        return new WhitePeople();
    }
}
