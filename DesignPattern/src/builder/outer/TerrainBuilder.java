package builder.outer;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:49:24
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 14:51:51
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\outer\TerrainBuilder.java
 */
public interface TerrainBuilder {
    TerrainBuilder buildFort();

    TerrainBuilder buildWall();

    TerrainBuilder buildEquipment();

    Terrain build();
}
