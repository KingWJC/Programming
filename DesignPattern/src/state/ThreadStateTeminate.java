/*
 * @Author: KingWJC
 * @Date: 2021-07-05 11:26:09
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 11:29:05
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadStateTeminate.java
 */
package state;

public class ThreadStateTeminate extends ThreadState {
    @Override
    public void run(MyThread thread) {
        System.out.println("no way!");
    }

    @Override
    public void block(MyThread thread) {
        System.out.println("no way!");
    }

    @Override
    public void waiting(MyThread thread) {
        System.out.println("no way!");
    }

    @Override
    public void timeWaiting(MyThread thread) {
        System.out.println("no way!");
    }
}