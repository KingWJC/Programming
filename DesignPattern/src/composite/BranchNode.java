
/*
 * @Author: KingWJC
 * @Date: 2021-05-31 14:58:12
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 15:02:17
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\composite\BranchNode.java
 */
package composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {
    private List<Node> childNodes;

    BranchNode(String branchName) {
        super(branchName);
        childNodes = new ArrayList<>();
    }

    public void add(Node node) {
        childNodes.add(node);
    }

    public void remove(Node node) {
        childNodes.remove(node);
    }

    public Node getChild(int index) {
        return childNodes.get(index);
    }

    public int getCount() {
        return childNodes.size();
    }

    @Override
    public void display() {
        System.out.println(getName());
    }
}