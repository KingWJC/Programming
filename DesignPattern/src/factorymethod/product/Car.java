package factorymethod.product;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:32:04
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:32:05
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\Car.java
 */
public class Car implements Moveable {
    private Human people;

    @Override
    public void go() {
        String color = people != null ? people.getColor() : "";
        System.out.println("I'm a " + color + " car driver!");
    }

    @Override
    public void setDriver(Human people) {
        this.people = people;
    }
}
