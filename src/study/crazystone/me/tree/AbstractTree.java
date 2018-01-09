package com.crazystone.datastructure.tree;

/**
 * Created by crazystone on 2016/3/30.
 */
public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E> {

    @Override
    public boolean isEmpty() {
        if (size() == 0) return true;
        return false;
    }
}
