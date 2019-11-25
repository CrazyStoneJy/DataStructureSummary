package me.crazystone.study.leetcode.factory;

import me.crazystone.study.common.Node;
import me.crazystone.study.utils.Logs;

import java.util.Random;

/**
 * Created by crazystone on 18-3-12.
 */
public class NodeFactory {

    static Random random = new Random();

    /**
     * generate a random node list
     *
     * @return
     */
    public static Node createNodeList() {
        int count = random.nextInt(20);
        Node root = new Node("root", random.nextInt(100));
        Node current = root;
        for (int i = 0; i < count; i++) {
            int value = random.nextInt(100);
            Node node = new Node("value" + i, value);
//            Logs.l(value);
            current.next = node;
            current = node;
        }
        return root;
    }

    /**
     * print the node list
     *
     * @param node
     */
    public static void printNode(Node node) {
        if (node == null) return;
        Node current = node;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            sb.append(current.value);
            sb.append("->");
            current = current.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
    }

    public static void main(String... args) {
        Node node = createNodeList();
        printNode(node);
    }

}
