package me.crazystone.study.leetcode;

import me.crazystone.study.common.Node;
import me.crazystone.study.leetcode.factory.NodeFactory;
import me.crazystone.study.utils.Logs;

/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 * <p>
 * Created by crazystone on 18-3-12.
 */
public class Question141 {

    public static void main(String... args) {
        Node node = new Node("0", 0);
        Node node1 = new Node("1", 1);
        Node node2 = new Node("2", 2);
        node.next = node1;
        node1.next = node2;
        Logs.l(judgeRing(node));
        node2.next = node;
        Logs.l(judgeRing(node));

    }


    public static boolean judgeRing(Node node) {
        Node first = node;
        Node second = node;
        int count = 0;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) {
                return true;
            }
            count++;
        }
        Logs.l("run times:" + count);
        return false;
    }


}
