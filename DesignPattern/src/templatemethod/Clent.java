/*
 * @Author: KingWJC
 * @Date: 2021-07-05 13:56:46
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 14:42:43
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\templatemethod\Clent.java
 * 
 * 抽象悍马车的类型
 * 1.喇叭，启动和停止为抽象方法，由子类实现
 * 2.是否启动喇叭为钩子方法，父类实现基本操作，子类进行扩展。
 * 3.发动机声音为具体方法，父类实现，永远不变。
 * 4.运行为模板方法，父类实现实际运行流程。
 * 
 */
package templatemethod;

public class Clent {
    public static void main(String[] args) {
        HummerModel model1 = new HummerModel1();
        model1.run();
        System.out.println("--------------------");
        HummerModel2 model2 = new HummerModel2();
        model2.run();
    }
}