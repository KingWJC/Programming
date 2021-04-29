package factorymethod.staticfactory;

import factorymethod.product.Human;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:11:01
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:30:36
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\Client.java
 */
public class Client {
    public static void main(String[] args) {
        Human people = StaticFactory.createHuman("White");
        people.getColor();
        people.speak();
    }
}
