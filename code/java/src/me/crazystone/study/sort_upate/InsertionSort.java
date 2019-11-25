package me.crazystone.study.sort_upate;

/**
 * 插入排序
 * Created by crazystone on 2016/3/5.
 */
public class InsertionSort {

    public static <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = 1; i < array.length; i++) {
            E insertObj = array[i];
            int j = i - 1;
            for (; j >= 0 && (insertObj.compareTo(array[j]) < 0); j--) {
                array[j + 1] = array[j];//元素后移
            }
            array[j+1] = insertObj;
        }
        return array;
    }

}
