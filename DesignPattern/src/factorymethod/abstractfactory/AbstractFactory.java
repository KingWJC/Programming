package factorymethod.abstractfactory;

import factorymethod.product.BlackPeople;
import factorymethod.product.Car;
import factorymethod.product.Human;
import factorymethod.product.Movable;
import factorymethod.product.Plane;
import factorymethod.product.WhitePeople;
import factorymethod.product.YellowPeople;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:04:49
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:04:50
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factory\AbstractFactory.java
 */
public interface AbstractFactory{
    Human createHuman();

    Movable createTraffic();
}

class YelloFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new YellowPeople();
    }

    @Override
    public Movable createTraffic() {
        return new Plane();
    }
}

class BlackFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new BlackPeople();
    }

    @Override
    public Movable createTraffic() {
        return new Car();
    }
}

class WhiteFactory implements AbstractFactory {
    @Override
    public Human createHuman() {
        return new WhitePeople();
    }

    @Override
    public Movable createTraffic() {
        return new Car();
    }
}

