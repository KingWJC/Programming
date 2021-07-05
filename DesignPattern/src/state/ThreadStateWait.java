/*
 * @Author: KingWJC
 * @Date: 2021-07-05 11:23:41
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 12:11:46
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadStateWait.java
 */
package state;

public class ThreadStateWait  extends ThreadState {
    @Override
    public void run(MyThread thread) {
        System.out.println("thread ready!");
        thread.setCurrent(new ThreadStateReady());
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