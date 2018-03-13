package study.crazystone.me.sort;

/**
 * 插入排序
 * 时间复杂度: O(n2)
 * Created by crazystone on 17-2-13.
 */
public class InsertionSort {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j >= 0; i--) {
                if (array[j] >= array[j - 1]) {
                    break;
                }
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        return array;
    }

}
