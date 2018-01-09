package study.crazystone.me.sort;

/**
 * 选择排序原理：
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * 第n-1次遍历，找到最小的数值与第n-1个元素交换，排序完成。
 * 与冒泡排序不同的是选择排序不是每次发现数据小的时候就会交换位置，而是将位置的下标记录下来，比较完一轮后，再去交换位置
 * Created by crazystone on 17-2-13.
 */
public class SelectionSort extends PrintArrayImpl{

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

}
