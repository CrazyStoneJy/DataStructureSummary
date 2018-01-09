package study.crazystone.me.sort_upate;

import java.util.List;

/**
 * 选择排序
 * Created by crazystone on 2016/2/23.
 */
public class SelectionSort {

    public static <E extends Comparable<E>> E[] sort(List<E> list) {
        E[] array = (E[]) list.toArray();
        return sort(array);
    }

    /***
     * 选择排序
     *
     * @param array
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> E[] sort(E[] array) {
        int min = 0;//min for index
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {//compare this value to min value
                    min = j;//mark the min index,
                }
            }
            if (min != i) {
                E temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }


}
