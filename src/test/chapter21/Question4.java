package test.chapter21;

import java.util.Arrays;

/**
 * 使用插入排序实现下面的方法。
 * public static <E extends Comparable<E>> void insertionSort(E[] list)
 * <p>
 * Created by crazystone on 17-2-26.
 */
public class Question4 {

    public static void main(String... args) {

        String[] array = new String[]{"aa", "cs", "ba", "fg", "ab"};
        System.out.println("sort before:" + Arrays.toString(array));
        insertionSort(array);
        System.out.println("sort after:" + Arrays.toString(array));
        System.out.println();
    }

    public static <E extends Comparable<E>> void insertionSort(E[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (list[j].compareTo(list[j - 1]) < 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }


}
