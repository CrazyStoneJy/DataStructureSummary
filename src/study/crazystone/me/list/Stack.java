package com.crazystone.datastructure.list;

/**
 * Created by crazystone on 2016/3/29.
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    int size();

    boolean isEmpty();


}
