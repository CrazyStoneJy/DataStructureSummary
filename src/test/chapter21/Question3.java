package test.chapter21;

import java.util.Arrays;

/**
 * 使用选择排序法实现下面的方法。
 * public static <E extends Comparable<E>> void selectionSort(E[] list)
 * Created by crazystone on 17-2-26.
 */
public class Question3 {

    public static void main(String... args) {

        String[] array = new String[]{"vo", "aa", "ac", "df", "bc", "ca"};
//        Integer[] array = new Integer[]{3,6,8,2,1,5};
        System.out.println("sort befor:" + Arrays.toString(array));
        selectionSort(array);
        System.out.println("sort after:" + Arrays.toString(array));

    }

    public static <E extends Comparable<E>> void selectionSort(E[] list) {
        for (int i = 0; i < list.length-1; i++) {
            int min = i;
            for (int j = i; j < list.length; j++) {
                if (list[j].compareTo(list[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                E temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }


}
