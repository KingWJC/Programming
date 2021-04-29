package factorymethod.product;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 10:13:27
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 10:35:11
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\factorymethod\product\Human.java
 * 
 * 语义上为名称，则使用抽象类。
 * 
 */
public abstract class Human {
    public abstract String getColor();

    public abstract void speak();
}