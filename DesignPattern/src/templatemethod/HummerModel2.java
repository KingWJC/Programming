/*
 * @Author: KingWJC
 * @Date: 2021-07-05 14:14:19
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 14:44:53
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\templatemethod\HummerModel2.java
 */
package templatemethod;

public class HummerModel2 extends HummerModel {

    @Override
    public void alarm() {
        System.out.println("第二代喇叭：哒哒哒。");
    }

    public void start() {
        System.out.println("启动悍马H2...");
    }

    public void stop() {
        System.out.println("停止悍马H2...");
    }

    public boolean isAlarm()
    {
        return super.isAlarm();
    }
}