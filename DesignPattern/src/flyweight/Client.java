/*
 * @Author: KingWJC
 * @Date: 2021-05-31 15:35:00
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 15:48:09
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\flyweight\Client.java
 * 
 * 字符串也使用享元模式，存储在常量池中。
 * 
 */

package flyweight;

public class Client {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4);
        System.out.println(s3.intern() == s1);
        System.out.println(s3.intern() == s4.intern());

        
        BulletFactory factory = new BulletFactory();
        for (int i = 0; i < 10; i++) {
            Bullet bullet = factory.getBullet();
            System.out.println(bullet);
        }
    }
}