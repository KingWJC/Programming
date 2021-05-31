/*
 * @Author: KingWJC
 * @Date: 2021-05-31 14:51:44
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-05-31 15:19:10
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\composite\Client.java
 */
package composite;

public class Client {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode branch1 = new BranchNode("branch1");
        BranchNode branch2 = new BranchNode("branch2");
        LeafNode n11 = new LeafNode("leaf11");
        LeafNode n12 = new LeafNode("leaf12");
        LeafNode n21 = new LeafNode("leaf21");
        LeafNode n22 = new LeafNode("leaf22");
        branch1.add(n11);
        branch1.add(n12);
        branch2.add(n21);
        branch2.add(n22);
        root.add(branch1);
        root.add(branch2);

        displayTree(root, 0);
    }

    private static void displayTree(Node node, int depth) {
        for (int i = 0; i < depth; i++)
            System.out.print("--");

        node.display();
        if (node instanceof BranchNode) {
            BranchNode branch = (BranchNode) node;
            for (int i = 0; i < branch.getCount(); i++) {
                displayTree(branch.getChild(i), depth + 1);
            }
        }
    }
}
