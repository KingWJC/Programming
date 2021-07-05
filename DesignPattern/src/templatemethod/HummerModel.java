/*
 * @Author: KingWJC
 * @Date: 2021-07-05 13:57:09
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-05 14:45:05
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\templatemethod\HummerModel.java
 */
package templatemethod;

public abstract class HummerModel {
    // 抽象方法
    public abstract void alarm();

    public abstract void start();

    public abstract void stop();

    // 具体方法
    private void engineBoom() {
        System.out.println("发送机轰鸣...");
    }

    // 钩子方法
    public boolean isAlarm() {
        return false;
    }

    // 模板方法
    public void run() {
        this.start();
        this.engineBoom();
        if (isAlarm())
            this.alarm();
        this.stop();
    }
}