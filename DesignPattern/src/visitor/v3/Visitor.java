/*
 * @Author: KingWJC
 * @Date: 2021-06-30 10:48:39
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 10:48:40
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\Visitor.java
 */
package visitor.v3;

public interface Visitor {
    double getCpuPrice(CPU cpu);

    double getMemoryPrice(Memory memory);
}

//公司用户打8折
class PersonalVisitor implements Visitor {
    @Override
    public double getCpuPrice(CPU cpu) {
        return cpu.getPrice() * 0.8;
    }

    @Override
    public double getMemoryPrice(Memory memory) {
        return memory.getPrice() * 0.8;
    }
}

//公司用户打5折
class CorpVisitor implements Visitor {
    @Override
    public double getCpuPrice(CPU cpu) {
        return cpu.getPrice() * 0.5;
    }

    @Override
    public double getMemoryPrice(Memory memory) {
        return memory.getPrice() * 0.5;
    }
}