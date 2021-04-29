package factorymethod.product;
/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:16:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:19:31
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\YellowPeople.java
 */
public class YellowPeople extends Human {

    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public void speak() {
        System.out.println("I'm yellow people!");
    }
}
