package study.crazystone.me.list;

/**
 * 数组线性表
 * Created by crazystone on 2016/3/28.
 */
public class MyArrayList<E> extends AbstractList<E> {

    private static final int INIT_CAPACITY = 16;
    private E[] array = (E[]) new Object[INIT_CAPACITY];

    public MyArrayList() {
    }

    public MyArrayList(E[] array) {
        super(array);
    }


    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size()) throw new IllegalStateException("index不在有效的范围内");
        ensureCapacity();
        //元素后移
        for (int i = size - 1; i >= index; i++) {
            array[i + 1] = array[i];
        }
        array[index] = e;
        size++;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index > size()) throw new IllegalStateException("index不在有效的范围内");
        E e = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        //将最后一个置null
        array[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size()) throw new IllegalStateException("index不在有效的范围内");
        return array[index];
    }

    @Override
    public E set(int index, E e) {
        if (index < 0 || index > size()) throw new IllegalStateException("index不在有效的范围内");
        E orignalData = get(index);
        array[index] = e;
        return orignalData;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(array[i])) return i;
        }
        return -1;
    }

    @Override
    public void clear() {
        array = (E[]) new Object[INIT_CAPACITY];
        size = 0;
    }

    /*  扩展空间如果size大于data的初始长度，则空间空间扩展一倍*/
    private void ensureCapacity() {
        if (size > array.length) {
            E[] newData = (E[]) new Object[size * 2 + 1];
            System.arraycopy(array, 0, newData, 0, size);
            array = newData;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
