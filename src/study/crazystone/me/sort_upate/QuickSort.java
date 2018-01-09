package com.crazystone.datastructure.sort;

import java.util.Comparator;

/**
 * 快速排序
 * Created by crazystone on 2016/3/5.
 */
public class QuickSort {

    public static <E extends Comparable<E>> E[] sort(E[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    /***
     * 快速排序(以递归的思想来进行排序)
     *
     * @param array 数组
     * @param first index for frist
     * @param last  index for last
     * @param <E>   extends Comparable的泛型
     */
    public static <E extends Comparable<E>> E[] quickSort(E[] array, int first, int last) {
        if (last > first) {
            int pivot = partition(array, first, last);
            quickSort(array, first, pivot - 1);
            quickSort(array, pivot + 1, last);
        }
        return array;
    }

    /***
     * 以第一个元素为基准点,将array分为前面的元素全部小于pivot,array后面的元素全部大于pivot
     *
     * @param array 数组
     * @param first 数组的第一个元素的index
     * @param last  数组最后一个元素的index
     * @param <E>   extends Comparable的泛型
     * @return 基准点pivot的索引
     */
    public static <E extends Comparable<E>> int partition(E[] array, int first, int last) {
        E pivot = array[first];
        int low = first + 1;//index for forward
        int high = last;//index for backward

        while (high > low) {
            while (high >= low && array[low].compareTo(pivot) <= 0) {
                low++;
            }
            while (high >= low && array[high].compareTo(pivot) > 0) {
                high--;
            }
            if (high > low) {
                E temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
        }

        //i don't know why do this
        while (high > first && array[high].compareTo(pivot) > 0)
            high--;

        //将pivot与array[high]比较，并交换元素
        if (pivot.compareTo(array[high]) > 0) {
            E temp = array[high];
            array[high] = pivot;
            array[first] = temp;
            return high;
        } else {
            return first;
        }
    }


}
