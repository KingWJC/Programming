package factorymethod.abstractfactory;

import factorymethod.product.Human;
import factorymethod.product.Movable;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:11:01
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 11:11:16
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\abstractfactory\Client.java
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new BlackFactory();
        
        Human people = factory.createHuman();
        people.getColor();
        people.speak();
        Movable traffic = factory.createTraffic();
        traffic.setDriver(people);
        traffic.go();
    }
}
