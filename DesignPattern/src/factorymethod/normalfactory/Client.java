package factorymethod.normalfactory;

import factorymethod.product.Human;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:11:01
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:52:52
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\normalfactory\Client.java
 */
public class Client {
    public static void main(String[] args) {
        Human people = new YelloFactory().createHuman();
        people.getColor();
        people.speak();
    }
}
