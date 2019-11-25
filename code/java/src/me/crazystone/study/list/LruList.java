package me.crazystone.study.list;

import java.util.*;

/**
 * Created by crazystone on 18-4-11.
 */
public class LruList<E> extends LinkedList<E> {

    private int threshold;

    public LruList(int threshold) {
        this.threshold = threshold;
    }

    public void addElement(E e) {
        if (size() == threshold) {
            adds(e, true);
        } else {
            adds(e, false);
        }
    }

    private void adds(E e, boolean isThreshold) {
        if (contains(e)) {
            remove(e);
            addFirst(e);
        } else {
            if (isThreshold) {
                removeLast();
            }
            addFirst(e);
        }
    }

    public java.util.List<E> getElements() {
        return this;
    }

}