package study.crazystone.me.list;

/**
 * Created by crazystone on 2016/3/28.
 */
public interface List<E> {

    /* 是否为空 */
    boolean isEmpty();

    /*  是否包含某元素*/
    boolean contains(E e);

    /*  获取list的长度*/
    int size();

    /*增加一个e元素*/
    void add(E e);

    /*明确的在index处插入e元素*/
    void add(int index, E e);

    /* 移除e元素 */
    boolean remove(E e);

    /* 移除index处的元素*/
    boolean remove(int index);

    /* 获取index处的元素*/
    E get(int index);

    /* 将index处改为新的e元素，并返回原先的元素 */
    E set(int index, E e);

    /* 正向获取该元素的索引，如元素不存在返回-1 */
    int indexOf(E e);

    /*  逆向获取该元素的索引，如元素不存在返回-1 */
    int lastIndexOf(E e);

    /*  清空数据*/
    void clear();

}
