/*
 * @Author: KingWJC
 * @Date: 2021-07-05 14:11:30
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 14:15:54
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\templatemethod\HummerModel1.java
 */
package templatemethod;

public class HummerModel1 extends HummerModel {

    private boolean isAlarm = true;

    @Override
    public void alarm() {
        System.out.println("第一代喇叭：嘀嘀嘀。");
    }

    public void start() {
        System.out.println("启动悍马H1...");
    }

    public void stop() {
        System.out.println("停止悍马H1...");
    }

    public boolean isAlarm() {
        return isAlarm;
    }
}