package test.chapter21;

/**
 * Created by crazystone on 17-2-26.
 */
public interface Stack<E> {

    E pop();

    void push(E e);

    E peek();

    int size();

    boolean isEmpty();

}
