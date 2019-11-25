package me.crazystone.study.test;

import me.crazystone.study.sort.BubbleSort;

import java.util.Arrays;

import static me.crazystone.study.sort.SelectionSort.sort;

/**
 * Created by crazystone on 17-2-11.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] array = new int[]{5, 9, 8, 6, 4};
        BubbleSort bubbleSort = BubbleSort.getInstance();
        System.out.println("原先数组的顺序：");
        bubbleSort.printArray(array);
        System.out.println("冒泡排序后：");
        bubbleSort.bubbleSort(array);
        bubbleSort.printArray(array);
        System.out.println("改良后的冒泡排序：");
        bubbleSort.bubbleSortPro(array);
        bubbleSort.printArray(array);
        System.out.println("选择排序");
        System.out.println(Arrays.toString(sort(array)));
        System.out.println("插入排序");
        System.out.println(Arrays.toString(sort(array)));
    }

}
