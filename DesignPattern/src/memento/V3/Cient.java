/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:17
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:16:24
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\Cient.java
 * 
 * 备忘录模式的扩展：
 * 1. 实现多属性。使用反射来减少多次赋值的操作。
 * 2. 实现多备份。
 * 
 */
package memento.V3;

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