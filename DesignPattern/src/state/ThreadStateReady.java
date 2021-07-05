/*
 * @Author: KingWJC
 * @Date: 2021-07-05 11:20:51
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 12:17:06
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadStateReady.java
 */
package state;

public class ThreadStateReady extends ThreadState {
    @Override
    public void run(MyThread thread) {
        System.out.println("thread running!");
        thread.setCurrent(new ThreadStateRunning());
    }

    @Override
    public void block(MyThread thread) {
        System.out.println("thread blocking!");
        thread.setCurrent(new ThreadStateBlock());
    }

    @Override
    public void waiting(MyThread thread) {
        System.out.println("thread waiting!");
        thread.setCurrent(new ThreadStateWait());
    }

    @Override
    public void timeWaiting(MyThread thread) {
        System.out.println("thread time waiting!");
        thread.setCurrent(new ThreadStateTimeWait());
    }
}