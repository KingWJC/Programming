package builder.inner;
/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:04:48
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 14:33:08
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\inner\Client.java
 */

import builder.inner.Person.PersonBuilder;

public class Client {
    public static void main(String[] args) {
        PersonBuilder builder = new Person.PersonBuilder();
        Person person = builder.basicInfo("name", 11, true).bodyInfo(55.2d, 179.9).contactInfo("addr", "email").build();
        System.out.println(person);
    }
}
