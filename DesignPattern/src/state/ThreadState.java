/*
 * @Author: KingWJC
 * @Date: 2021-07-05 10:55:36
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 11:07:01
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\ThreadState.java
 */
package state;

public abstract class ThreadState {
    public abstract void run(MyThread thread);
    public abstract void block(MyThread thread);
    public abstract void waiting(MyThread thread);
    public abstract void timeWaiting(MyThread thread);
}