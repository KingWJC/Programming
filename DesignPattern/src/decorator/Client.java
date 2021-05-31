/*
 * @Author: KingWJC
 * @Date: 2021-05-31 14:52:24
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 17:25:42
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\decorator\Client.java
 * 
 * BufferedReader为装饰器，扩充Reader的职责，可以读取一行。
 * 
 */
package decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        try {
            File file = new File("pathname");
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            bufferedReader.readLine();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}