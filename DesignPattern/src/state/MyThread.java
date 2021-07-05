/*
 * @Author: KingWJC
 * @Date: 2021-07-05 10:55:20
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 11:29:57
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\MyThread.java
 */
package state;

public class MyThread {
    private ThreadState current;
    private boolean isFinished;

    public MyThread() {
        current = new ThreadStateNew();
        System.out.println("thread new!");
    }

    public void setCurrent(ThreadState current) {
        this.current = current;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public void run() {
        current.run(this);
    }

    public void block() {
        current.block(this);
    }

    public void waiting() {
        current.waiting(this);
    }

    public void timeWaiting() {
        current.timeWaiting(this);
    }
}
