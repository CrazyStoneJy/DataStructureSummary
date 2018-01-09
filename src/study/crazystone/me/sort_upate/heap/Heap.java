package study.crazystone.me.sort_upate.heap;

import java.util.Comparator;

/**
 * heap(堆)的接口
 * Created by crazystone on 2016/3/4.
 */
public interface Heap<E> {

    void add(E e);

    E remove();

    int getSize();

    boolean isEmpty();
}
