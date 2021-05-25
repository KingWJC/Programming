/*
 * @Author: KingWJC
 * @Date: 2021-05-25 15:05:42
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-25 16:08:03
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\prototype\Location.java
 */
package prototype;

public class Location implements Cloneable {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return street + "街道" + roomNo + "房间";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}