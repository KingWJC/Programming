/*
 * @Author: KingWJC
 * @Date: 2021-07-05 10:56:03
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 12:26:10
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\state\Client.java
 */
package state;

public class Client {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        //就绪
        thread.run();
        //运行
        thread.run();
        //等待同步代码块的锁
        thread.block();
        //获得同步锁
        thread.run();
        //等待一段时间，Thread.Sleep(time),o.wait(time),t.join(time)
        thread.timeWaiting();
        //时间结束，开始运行
        thread.run();
        //一直等待，t.join(),o.wait(), LockSupport.park()
        thread.waiting();
        //o.notify(),o.notifyall(),LockSupport.unpark()
        thread.run();
        //线程执行结束
        thread.setFinished(true);
        thread.run();
        thread.run();
    }
}