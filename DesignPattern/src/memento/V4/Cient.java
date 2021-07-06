/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:17
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:23:01
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V4\Cient.java
 * 
 * 备忘录模式的扩展：
 * 1. 备份对象对外不可修改。在源对象中，作为内置类。
 * 
 */
package memento.V4;

public class Cient {
    public static void main(String[] args) {
        Originator orig = new Originator();
        orig.setState1("aaa");
        orig.setState2("bbb");
        orig.setState3("ccc");
        System.out.println(orig);
        // 记录状态
        CareTaker taker = new CareTaker();
        taker.setMemento("2021", orig.create());
        // 修改状态并记录
        orig.setState1("xxx");
        orig.setState2("yyy");
        orig.setState3("zzz");
        System.out.println(orig);
        taker.setMemento("2022", orig.create());
        // 还原状体
        orig.restore(taker.getMemento("2021"));
        System.out.println(orig);
    }
}