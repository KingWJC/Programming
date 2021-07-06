/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:30:59
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-02 11:07:12
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v1\Client.java
 * 
 * 访问者需要将抽象元素转换为具体元素，才能执行成功。
 * 
 */
package visitor.v1;

public class Client {
    public static void main(String[] args) {
        File file = new PlainFile("Plain File", 100);
        File dir = new Directory("Directory");
        Visitor print = new PrinterVisitor();
        print.visit((PlainFile) file);
        print.visit((Directory) dir);
    }
}