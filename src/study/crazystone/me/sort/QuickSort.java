package study.crazystone.me.sort;

import java.util.Arrays;

/**
 * 快速排序
 * 实现:
 * 1. 从数列中挑出一个元素，称为"基准"（pivot），
 * 2. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任何一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * 3. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * 平均时间复杂度O(n*logn),最坏时间复杂度为:O(n2),好坏基于第一次所选取的基准点而定,基准点越接近于中位数,效率越高.
 * 参考链接:
 * http://wiki.jikexueyuan.com/project/easy-learn-algorithm/fast-sort.html
 * https://zh.wikipedia.org/wiki/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
 * Created by crazystone on 18-3-8.
 */
public class QuickSort {


    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        while (low < high) {
            while (low < high && array[high] >= pivot) {
                --high;
            }
            array[low] = array[high];
            while (low < high && array[low] <= pivot) {
                ++low;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }

}
