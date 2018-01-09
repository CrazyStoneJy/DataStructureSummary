package study.crazystone.me.test.chapter21;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 17-2-26.
 */
public class GenericStack<E> implements Stack<E> {

    private List<E> mList = new ArrayList<>();
    private static final int BASE_CAPACITY = 8;
    private E[] array = (E[]) new Object[BASE_CAPACITY];

    @Override
    public E pop() {
//        E e = mList.get(size() - 1);
//        mList.remove(size() - 1);
        return null;
    }

    @Override
    public void push(E e) {
//        mList.add(e);
        int currentCapacity = size() + 1;
//        if()
    }

    @Override
    public E peek() {
        E e = array[size() - 1];
//        E e = mList.get(size() - 1);
        return e;
    }

    @Override
    public int size() {
        return array != null ? array.length : 0;
//        return mList != null ? mList.size() : 0;
    }

    @Override
    public boolean isEmpty() {
//        return mList == null || mList.size() == 0;
        return array == null || array.length == 0;
    }
}
