/*
 * @Author: KingWJC
 * @Date: 2021-07-05 11:21:31
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 12:23:39
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadStateRunning.java
 */
package state;

public class ThreadStateRunning extends ThreadState {
    @Override
    public void run(MyThread thread) {
        if (thread.isFinished()) {
            System.out.println("Thread teminated!");
            thread.setCurrent(new ThreadStateTeminate());
        } else {
            System.out.println("no way!");
        }

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