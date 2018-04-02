package study.crazystone.me.leetcode;

import study.crazystone.me.common.Node;
import study.crazystone.me.leetcode.factory.NodeFactory;

/**
 * Reverse a singly linked list.
 * Created by crazystone on 18-3-15.
 */
public class Question206 {

    public static void main(String... args) {
//        Node node1 = new Node("1",1);
//        Node node2 = new N
        Node node = NodeFactory.createNodeList();
        NodeFactory.printNode(node);
        Node reverseNode = reverse(node);
        NodeFactory.printNode(reverseNode);
    }

    public static Node reverse(Node root) {
        Node reverseNode = null;
        while (root != null) {
            Node node = root.next;
            root.next = reverseNode;
            reverseNode = root;
            root = node;
        }
        return reverseNode;
    }


}
