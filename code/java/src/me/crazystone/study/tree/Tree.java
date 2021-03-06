package me.crazystone.study.tree;


public interface Tree<E extends Comparable<E>> {

    boolean insert(E e);

    boolean delete(E e);

    boolean search(E e);

    int size();

    boolean isEmpty();

    void clear();

    /**
     * 返回二叉树的最大深度
     *
     * @return
     */
    int getMaxDeep();


}
