package me.crazystone.study.sort_upate;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序(递归思想)
 * Created by crazystone on 2016/2/22.
 */
public class MergeSort {

    public static <E extends Comparable<E>> E[] mergeSort(E[] array, int start, int end) {
        E[] afterArray = null;
        if (array.length > 1) {
            E[] first = (E[]) new Comparable[array.length / 2];
            System.arraycopy(array, 0, first, 0, array.length / 2);

            int secondHalfLength = array.length - array.length / 2;
            E[] second = (E[]) new Comparable[secondHalfLength];
            System.arraycopy(array, array.length / 2, second, 0, secondHalfLength);
            afterArray = merge(first, second);
        }
        return afterArray;
    }

    //fixme(has ClassCastException ,but i don't know)
    public static <E extends Comparable<E>> E[] sort(E[] array) {
        return mergeSort(array, 0, array.length);
    }


    /***
     * 归并
     *
     * @param first  first array
     * @param second second array
     * @param <E>
     * @return merge after array
     */
    public static <E extends Comparable<E>> E[] merge(E[] first, E[] second) {
        int index1 = 0, index2 = 0, index3 = 0;
        E[] after = (E[]) new Comparable[first.length + second.length];//has problem
        while (index1 < first.length || index2 < second.length) {
            if (first[index1].compareTo(second[index2]) < 0) {
                after[index3] = first[index1];
                index1++;
                index3++;
            } else {
                after[index3] = second[index2];
                index2++;
                index3++;
            }

            while (index1 < first.length) {
                after[index3] = first[index1];
                index1++;
                index3++;
            }

            while (index2 < second.length) {
                after[index3] = second[index2];
                index2++;
                index3++;
            }
        }
        return after;
    }
}
