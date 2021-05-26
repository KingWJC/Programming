package factorymethod.product;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:33:18
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 11:08:34
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\Plane.java
 */
public class Plane implements Movable {
    private Human people;

    @Override
    public void go() {
        String color = people != null ? people.getColor() : "";
        System.out.println("I'm a " + color + " plane pilot!");
    }

    @Override
    public void setDriver(Human people) {
        this.people = people;
    }

}
