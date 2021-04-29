package builder.outer;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:37:05
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 14:54:12
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\outer\Terrain.java
 * 
 * 地形（基地，墙，装备)
 * 
 */
public class Terrain {
    Wall wall;
    Fort fort;
    Equipment equipment;
}

class Fort {
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

class Wall {
    int x, y, w, h;

    public Wall(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

class Equipment {
    int x, y;

    public Equipment(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
