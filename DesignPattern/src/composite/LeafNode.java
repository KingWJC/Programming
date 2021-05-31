/*
 * @Author: KingWJC
 * @Date: 2021-05-31 14:57:29
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 14:57:30
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\composite\LeafNode.java
 */
package composite;

public class LeafNode extends Node {
    LeafNode(String leafName) {
        super(leafName);
    }

    @Override
    public void display() {
        System.out.println(getName());
    }
}