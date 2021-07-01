
/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:30:59
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-01 17:31:00
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v1\Client.java
 */
package visitor.v1;

public class Client {
    public static void main(String[] args) {
        File file = new PlainFile("Plain File", 100);
        File dir = new Directory("Directory");
        Visitor print = new PrinterVisitor();
        print.visit((PlainFile)file);
        print.visit((Directory)dir);
    }
}