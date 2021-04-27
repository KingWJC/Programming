package singleton;
/*
 * @Author: KingWJC
 * @Date: 2021-04-27 15:12:15
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 17:13:04
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\Demo05.java
 * 
 * 静态内部类方式。同样利用了classloder的机制来保证初始化instance时只有一个线程。
 * JVM保证单例：加载外部类时，不会加载内部类，只有在使用时才加载，实现懒加载。
 * 
 */

public class Demo05 {
    private Demo05() {
    }

    private static class InstanceCreator {
        private final static Demo05 INSTANCE = new Demo05();
    }

    public static Demo05 getInstance() {
        return InstanceCreator.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo05.getInstance().hashCode());
            }).start();
        }
    }
}
