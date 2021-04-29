package factorymethod.product;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:17:28
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:17:28
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\WhitePeople.java
 */
public class WhitePeople extends Human {

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public void speak() {
        System.out.println("I'm white people!");
    }
}
