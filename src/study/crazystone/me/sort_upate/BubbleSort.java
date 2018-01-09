package com.crazystone.datastructure.sort;

import java.util.List;

/**
 * 冒泡算法
 * Created by crazystone on 2016/2/22.
 */
public class BubbleSort {

    public static <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    E temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static <E extends Comparable<E>> E[] sort(List<E> list) {
        E[] array = (E[]) list.toArray();
        return sort(array);
    }

    /***
     * 优化后的冒泡排序算法(增加了一个boolean标志位，如果上次没有元素进行交换，则说明排序已经好，没必要再去比较)
     *
     * @param array 数组
     * @param <E>   extends Comparable
     * @return
     */
    public static <E extends Comparable<E>> E[] optimzSort(E[] array) {
        boolean isContinue = true;
        for (int i = 0; i < array.length - 1 && isContinue; i++) {
            isContinue = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    E temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    isContinue = true;
                }
            }
        }
        return array;
    }

    public static <E extends Comparable<E>> E[] optimzSort(List<E> list) {
        E[] array = (E[]) list.toArray();
        return array;
    }

}
