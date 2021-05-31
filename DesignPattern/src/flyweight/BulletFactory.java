/*
 * @Author: KingWJC
 * @Date: 2021-05-31 15:41:35
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 15:46:17
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\flyweight\BulletFactory.java
 */
package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BulletFactory {
    List<Bullet> list;

    BulletFactory() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Bullet());
        }
    }

    public Bullet getBullet() {
        for (Bullet item : list) {
            if (!item.isLiving) {
                return item;
            }
        }
        return new Bullet();
    }
}