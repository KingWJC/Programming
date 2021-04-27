package singleton;

/*
 * @Author: KingWJC
 * @Date: 2021-04-27 15:08:20
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 17:14:23
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\Demo04.java
 * 
 * 懒汉模式
 * 使用同步代码块和双重校验锁，即确保对象唯一，又提升效率。
 * 
 */
public class Demo04 {
    private volatile  static Demo04 instance;

    private Demo04() {
    }

    public static Demo04 getInstance() {
        if (instance == null) {
            synchronized (Demo04.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Demo04();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 9; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo04.getInstance().hashCode());
            }).start();
        }
    }
}
