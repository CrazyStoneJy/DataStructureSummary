package me.crazystone.study.list;

/**
 * list的抽象类框架
 * Created by crazystone on 2016/3/28.
 */
public abstract class AbstractList<E> implements List<E> {

    protected int size = 0;

    public AbstractList() {
    }


    public AbstractList(E[] array) {
        for (E e : array) {
            add(e);
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        add(size, e);
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) > 0) {
            remove(indexOf(e));
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(E e) {
        if (indexOf(e) > 0) return true;
        return false;
    }
}
