package study.crazystone.me.sort_upate;


import study.crazystone.me.sort_upate.heap.HeapSort;

/**
 * Created by crazystone on 2016/3/6.
 */
public class SortUtils {

    /***
     * 依据不同的排序type来选择排序
     *
     * @param array 排序前的数组
     * @param type  排序的type
     * @param <E>
     */
    public static <E extends Comparable<E>> void sort(E[] array, SortType type) {
        if (type == SortType.BUBBLE) printBeforeAfter(type, array, BubbleSort.sort(array));
        if (type == SortType.HEAP) printBeforeAfter(type, array, HeapSort.sort(array));
        if (type == SortType.INSERTION) printBeforeAfter(type, array, InsertionSort.sort(array));
        if (type == SortType.MERGE) printBeforeAfter(type, array, MergeSort.sort(array));//has problem
        if (type == SortType.QUICK) printBeforeAfter(type, array, QuickSort.sort(array));
        if (type == SortType.SELECTION) printBeforeAfter(type, array, SelectionSort.sort(array));
    }

    /***
     * 打印排序前和排序后的数组顺序
     *
     * @param before 排序前
     * @param after  排序后
     * @param <E>
     */
    public static <E extends Comparable<E>> void printBeforeAfter(SortType type, E[] before, E[] after) {
        System.out.println("sort type:" + type.name());
        printArray(before);
        printArray(after);
    }

    /**
     * 打印数组
     *
     * @param array 数组
     * @param <E>   extends Comparable<E>
     */
    public static <E extends Comparable<E>> void printArray(E[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

}
