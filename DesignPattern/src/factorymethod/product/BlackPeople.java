package factorymethod.product;
/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:17:11
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:19:23
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\BlackPeople.java
 */
public class BlackPeople extends Human {

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public void speak() {
        System.out.println("I'm black people!");
    }
}

