/*
 * @Author: KingWJC
 * @Date: 2021-06-30 10:47:21
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 10:50:48
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\Hardware.java
 */
package visitor.v3;

public abstract class Hardware {
    abstract double getPrice();
    abstract double accept(Visitor visitor);
}

class CPU extends Hardware
{
    @Override
    double getPrice() {
        return 100;
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.getCpuPrice(this);
    }
}

class Memory extends Hardware
{
    @Override
    double getPrice() {
        return 200;
    }

    @Override
    double accept(Visitor visitor) {
        return visitor.getMemoryPrice(this);
    }
}