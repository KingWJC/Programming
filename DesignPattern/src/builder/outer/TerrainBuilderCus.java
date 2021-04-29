package builder.outer;
/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:53:18
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 14:53:19
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\outer\TerrainBuilderCus.java
 * 
 * 自定义地形
 */

public class TerrainBuilderCus implements TerrainBuilder {

    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildFort() {
        terrain.fort = new Fort(47, 97, 3, 3);
        return this;
    }

    @Override
    public TerrainBuilder buildWall() {
        terrain.wall = new Wall(10, 10, 80, 2);
        return this;
    }

    @Override
    public TerrainBuilder buildEquipment() {
        terrain.equipment = new Equipment(50, 50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }

}
