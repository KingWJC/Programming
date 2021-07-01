/*
 * @Author: KingWJC
 * @Date: 2021-06-30 10:46:05
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 10:46:06
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\Computer.java
 */
package visitor.v3;

public class Computer {
    private double totalPrice;
    private Hardware cpu = new CPU();
    private Hardware memory = new Memory();

    public void acceptVisitor(Visitor visitor) {
        totalPrice += cpu.accept(visitor);
        totalPrice += memory.accept(visitor);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}