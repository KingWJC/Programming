package singleton;
/*
 * @Author: KingWJC
 * @Date: 2021-04-27 11:19:19
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 15:18:06
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\singleton\Demo02.java
 * 
 *  懒汉模式：按需初始化
 *  缺点：线程不安全
 *  hashcode相同，但对象不一定相同。
 * 
 */

public class Demo02 {
    private static Demo02 instance;

    private Demo02() {
    }

    public static Demo02 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Demo02();
        }
        return instance;
    }

    public void test() {
        System.out.println("singleton");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Demo02.getInstance().hashCode());
            }).start();;
        }
    }
}
