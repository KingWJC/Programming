/*
 * @Author: KingWJC
 * @Date: 2021-06-30 11:07:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 11:12:44
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\Client.java
 * 
 * 电脑有固定的硬件组成结构，而对于硬件的价格，个人用户和公司用户有不同的折扣。
 * 所以可以使用访问者模式，将价格的计算抽象分离出来，容易扩展多个类型的折扣。
 * 
 */
package visitor.v3;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Visitor visitor = new CorpVisitor();
        computer.acceptVisitor(visitor);
        System.out.println(computer.getTotalPrice());
    }
}