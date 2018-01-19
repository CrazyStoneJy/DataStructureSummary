package study.crazystone.me.tree_update;


public interface Tree<E extends Comparable<E>> {

    boolean insert(E e);

    boolean delete(E e);

    boolean search(E e);

    int size();

    boolean isEmpty();

    void clear();


}
