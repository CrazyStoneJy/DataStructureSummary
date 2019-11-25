package me.crazystone.study.common;

/**
 * Created by crazystone on 17-2-14.
 */
public class Node {
    public String name;
    public Node next;
    public int value;

//    public Node(String name) {
//        this.name = name;
//    }


    public Node(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "node name is:" + this.name;
    }
}
