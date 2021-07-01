
/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:30:59
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-01 18:14:29
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v2\Client.java
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