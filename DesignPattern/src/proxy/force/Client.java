/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:37:23
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:46:27
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\force\Client.java
 */
package proxy.force;

public class Client {
    public static void main(String[] args) {
        //不允许直接访问真实角色和代理角色.
        Subject realSub = new RealSubject();
        Subject proxy = new ProxySubject(realSub);
        proxy.request();

        Subject forceProxy = realSub.getProxy();
        forceProxy.request();
    }
}