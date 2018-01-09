package study.crazystone.me.tree;

import java.util.Iterator;

/**
 * Created by crazystone on 2016/3/30.
 */
public interface Tree<E extends Comparable<E>> {

    public boolean insert(E e);

    public boolean search(E e);

    public boolean delete(E e);

    /*  tree的先序遍历*/
    public void preOrder();

    /* tree的中序遍历*/
    public void inOrder();

    /*tree的后序遍历*/
    public void postOrder();

    public int size();

    public boolean isEmpty();

    public void clear();

    public void iterator();

}
