package study.crazystone.me.list;

import study.crazystone.me.common.Node;

import java.util.List;

/**
 * 判断一个链表中是否有环
 * Created by crazystone on 18-1-9.
 */
public class JudgeRing {

    public static void main(String... args) {
        Node head = new Node("A", 1);
        Node node1 = new Node("B", 2);
        Node node2 = new Node("C", 3);
        Node node3 = new Node("D", 4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        String str = "";
//        str.toCharArray();
//        Character
        List<Character> list;
        Character c = str.charAt(0);
//        printNode(head);
        System.out.print(judgeRing(head));
    }

    private static void printNode(Node node) {
        while (node != null) {
            System.out.println(node.name);
            node = node.next;
        }
    }

    /**
     * 原理:这里也是用到两个指针。如果一个链表中有环，也就是说用一个指针去遍历，是永远走不到头的。
     * 因此，我们可以用两个指针去遍历，一个指针一次走两步，一个指针一次走一步，如果有环，两个指针肯定会在环中相遇。
     * 时间复杂度为O（n）
     *
     * @param node
     * @return
     */
    private static boolean judgeRing(Node node) {
        Node temp1 = node;
        Node temp2 = node;
        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            System.out.println(">>>>>>");
            System.out.println(temp1);
            System.out.println(temp2);
            System.out.println(">>>>>>");
            if (temp1 == temp2) {
                return true;
            }
        }
        return false;
    }

}
