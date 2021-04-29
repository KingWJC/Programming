package builder.outer;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:05:06
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 15:03:49
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\outer\Clent.java
 */
public class Clent {
    public static void main(String[] args) {
        TerrainBuilder builder = new TerrainBuilderCus();
        builder.buildFort().buildWall().buildEquipment().build();
    }
}
