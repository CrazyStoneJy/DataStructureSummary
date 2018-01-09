package com.crazystone.datastructure.sort.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by crazystone on 2016/3/4.
 */
public abstract class AbstractHeap<E> implements Heap<E> {

    protected List<E> mList = new ArrayList<E>();

    @Override
    public void add(E e) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int getSize() {
        return mList.size();
    }

    @Override
    public boolean isEmpty() {
        return mList.size() == 0;
    }

    public void printHeap() {
        if(mList==null)return;
        System.out.println("add after heap:"+mList.toString());
    }
}
