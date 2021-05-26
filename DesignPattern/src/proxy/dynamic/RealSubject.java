
/*
 * @Author: KingWJC
 * @Date: 2021-05-26 14:41:24
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 14:41:25
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\proxy\dynamic\RealSubject.java
 */
package proxy.dynamic;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("request info.");
    }
}