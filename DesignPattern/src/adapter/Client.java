/*
 * @Author: KingWJC
 * @Date: 2021-05-26 10:55:34
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-26 11:00:41
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\adapter\Client.java
 */
package adapter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws Exception {
        ByteArrayInputStream bis = new ByteArrayInputStream("wjcjldfjslfj\na;lsdk;ad".getBytes());
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        bis.close();
        isr.close();
        br.close();
    }
}