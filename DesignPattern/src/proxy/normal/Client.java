/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:37:23
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 15:36:42
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\normal\Client.java
 * 
 * 坦克运作，增加时间和日志。
 * 1.最简单的办法：修改代码，记录时间
 * 2.若无法改变方法源码，使用继承
 * 3.若增加其它操作，无法扩展，使用代理
 * v06:代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * v07:代理的对象改成Movable类型-越来越像decorator了
 * 
 */
package proxy.normal;

public class Client {
    public static void main(String[] args) {
        Movable tank = new Tank();
        Movable proxyTime = new MoveTimeProxy(tank);
        Movable proxyLog = new MoveLogProxy(proxyTime);
        proxyLog.move();
    }
}