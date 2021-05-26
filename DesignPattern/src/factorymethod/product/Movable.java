package factorymethod.product;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:31:36
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:31:53
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\Moveable.java
 * 
 * 语义上是行为，用接口
 * 
 */
public interface Movable {
    void go();

    void setDriver(Human people);
}
