package study.crazystone.me.list;

import java.util.LinkedList;

/**
 * 栈的实现
 * Created by crazystone on 2016/3/29.
 */
public class MyStack<E> implements Stack<E> {

    private int size = 0;
    private LinkedList<E> list = new LinkedList<E>();

    @Override
    public void push(E e) {
        list.addLast(e);
        size++;
    }

    @Override
    public E pop() {
        E e = list.removeFirst();
        size--;
        return e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
