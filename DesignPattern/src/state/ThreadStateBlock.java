/*
 * @Author: KingWJC
 * @Date: 2021-07-05 11:18:02
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 11:19:12
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadStateBlock.java
 */
package state;

public class  ThreadStateBlock extends ThreadState {
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