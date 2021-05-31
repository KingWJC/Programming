
/*
 * @Author: KingWJC
 * @Date: 2021-05-31 14:57:02
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 14:57:02
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\composite\Node.java
 */
package composite;

public abstract class Node {
    private String name;

    Node(String nodeName) {
        this.name = nodeName;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}