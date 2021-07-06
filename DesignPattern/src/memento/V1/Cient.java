/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:24:17
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 13:44:37
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V1\Cient.java
 * 
 * 备忘录模式的扩展：克隆。
 * 
 */
package memento.V1;

public class Cient {
    public static void main(String[] args) {
        Originator orig = new Originator();
        orig.setState("New");
        System.out.println(orig.getState());
        // 记录状态
        CareTaker taker = new CareTaker();
        taker.setMemento(orig.create());
        // 修改状态
        orig.setState("Update");
        System.out.println(orig.getState());
        // 还原状体
        orig.restore(taker.getMemento());
        System.out.println(orig.getState());
    }
}