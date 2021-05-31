/*
 * @Author: KingWJC
 * @Date: 2021-05-31 15:37:06
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 15:40:54
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\flyweight\Bullet.java
 */
package flyweight;

import java.util.UUID;

public class Bullet {
    private UUID id = UUID.randomUUID();
    boolean isLiving = true;

    @Override
    public String toString() {
        return "Bullet{id=" + id + "}";
    }
}