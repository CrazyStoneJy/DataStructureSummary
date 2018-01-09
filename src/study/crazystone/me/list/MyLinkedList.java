package com.crazystone.datastructure.list;

/**
 * Created by crazystone on 2016/3/28.
 */
public class MyLinkedList<E> extends AbstractList<E> {

    private Node<E> head, tail;

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> current = head;//获取head的节点
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    @Override
    public boolean remove(int index) {
        if (index >= size || index < 0)
            throw new IllegalStateException("index cannot be negative,or index out of range");
        if (index == 0) {
            removeFirst();
            return true;
        } else if (index == size - 1) {
            removeLast();
            return true;
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return true;
        }
//        return false;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0)
            throw new IllegalStateException("index cannot be negative,or index out of range");

        Node<E> current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E set(int index, E e) {
        if (index >= size || index < 0)
            throw new IllegalStateException("index cannot be negative,or index out of range");

        Node<E> previous = head;
        E oldValue = null;
        Node<E> newNode = new Node<E>(e);
        if (index == 0) {
            head = newNode;
            newNode.next = previous;
            return head.element;
        } else {
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            oldValue = previous.next.element;
            newNode.next = previous.next.next;
            previous.next = newNode;
            return oldValue;
        }
    }

    @Override
    public int indexOf(E e) {

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(e)) return i;
            current = current.next;
        }
        return -1;
    }

    //todo
    @Override
    public int lastIndexOf(E e) {
//        for
        return 0;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    private void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) tail = head;
    }


    private void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }


    private E getFirst() {
        if (size != 0) return head.element;
        return null;
    }


    private E getLast() {
        if (tail != null) return tail.element;
        return null;
    }

    private E removeFirst() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head.next;
            head = current;
            size--;
            return current.element;
        }
    }


    private E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;//清空链表
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) {//获取倒数第二个元素
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    static class Node<E> {
        E element;
        Node<E> next;

        public Node(E e) {
            this.element = e;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            sb.append(current != null ? current.element : null);
            if (i != size - 1) {
                sb.append(",");
            }
            if (current != null) current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
