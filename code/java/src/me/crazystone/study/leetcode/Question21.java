package me.crazystone.study.leetcode;

/**
 * Created by crazystone on 18-1-26.
 */
public class Question21 {

    public static void main(String... args) {

        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(4);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(2);
        ListNode node23 = new ListNode(3);
        node21.next = node22;
        node22.next = node23;

        printNode(node11);
        printNode(node21);

        Solution solution = new Question21.Solution();
        ListNode mergeNode = solution.mergeTwoLists(node11, node21);

        printNode(mergeNode);

    }


    private static String printNode(ListNode node) {
        ListNode root = node;
        StringBuilder sb = new StringBuilder();
        while (root != null) {
            int val = root.val;
            sb.append(val).append("->");
            root = root.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb);
        return sb.toString();
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        //非递归算法
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode root = new ListNode(-1);
            ListNode current = root;

            while (l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    current.next = l2;
                    l2 = l2.next;
                } else {
                    current.next = l1;
                    l1 = l1.next;
                }
                current = current.next;
            }
            current.next = (l1 == null ? l2 : l1);

            return root.next;
        }
    }

}
