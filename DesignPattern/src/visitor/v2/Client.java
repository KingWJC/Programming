/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:30:59
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 16:20:36
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v2\Client.java
 * 
 * 抽象元素接收访问者抽象，根据访问者对象的具体类型和抽象元素的具体类型，来决定执行什么方法。
 * 
 */
package visitor.v2;

public class Client {
    public static void main(String[] args) {
        File file = new PlainFile("Plain File", 100);
        File dir = new Directory("Directory");
        Visitor print = new PrinterVisitor();
        file.accept(print);
        dir.accept(print);
    }
}