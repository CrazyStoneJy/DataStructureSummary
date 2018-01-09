package algorithm;

import java.util.Stack;

/**
 * 输入一个链表的头结点,从尾到头反过来打印出每个结点的值。
 * Created by crazystone on 17-2-14.
 */
public class Question5 {

    public static void main(String[] args){

        Node root = new Node("root");
        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");
        root.next = node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=null;

        System.out.println("逆向输出：");
        reverse(root);
        System.out.println(">>>>>>>>>>>");
        recusiveReverse(root);
    }

    public static void reverse(Node root){
        Stack<Node> stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root=root.next;
        }
        while(!stack.isEmpty()){
              System.out.println(stack.pop().name);
        }
    }

    //递归的方式，利用方法栈逆序输出
    public static void recusiveReverse(Node root){
        if(root!=null){
            if(root.next!=null){
                recusiveReverse(root.next);
            }
        }
        System.out.println(root.name);
    }


}
