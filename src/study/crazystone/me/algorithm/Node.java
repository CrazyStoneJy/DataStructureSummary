package algorithm;

/**
 * Created by crazystone on 17-2-14.
 */
public class Node {
    String name;
    Node next;

    public Node(String name){
        this.name=name;
    }

    public boolean hasNext(){
        return next!=null;
    }

}
