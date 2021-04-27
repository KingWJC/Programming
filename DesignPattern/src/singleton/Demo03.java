/*
 * @Author: KingWJC
 * @Date: 2021-04-27 14:46:34
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 15:08:09
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\Demo03.java
 * 
 * 懒汉模式
 * 上一种的优化，使用synchronized方法解决线程安全的问题。
 * 缺点是效率低，使用同步代码块，试图减少同步代码，但是不可行。
 * 
 */
package singleton;

public class Demo03 {
    private static Demo03 instance;

    private Demo03() {
    }

    public synchronized static Demo03 getInstance() {
        if (instance == null) {
            // 妄图通过减小同步代码块的方式提高效率，然后不可行
            // synchronized(Demo03.class) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new Demo03();
            // }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 9; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo03.getInstance().hashCode());
            }).start();
        }
    }
}
