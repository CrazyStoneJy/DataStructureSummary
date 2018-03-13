package study.crazystone.me.sort;

/**
 * Created by crazystone on 18-3-8.
 */
public class SortTotalTest {

    public static void main(String... args) {

        int[] array = {3, 6, 8, 2, 1};
        print("排序前:", array);
//        bubbleSort(array);
//        print("冒泡排序:", array);
//        selectionSort(array);
//        print("选择排序:", array);
//        insertionSort(array);
//        print("插入排序:", array);
//        quickSort(array);
        QuickSort.sort(array);
        print("快速排序;", array);
    }


    private static void print(String desc, int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append(desc);
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1)
                sb.append(",");
        }
        sb.append("]");
        System.out.println(sb);
    }

    /**
     * 冒泡排序
     * 时间复杂度O(n2)
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        // 总共比较的次数
        for (int i = 0; i < array.length - 1; i++) {
            // 每次比较前一个与后一个元素
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 时间复杂度:O(n2)
     * 相比冒泡排序,选择排序只是减少了数值交换的操作,并没有降低时间复杂度.
     *
     * @param array
     */
    private static void selectionSort(int[] array) {
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
    }

    /**
     * 插入排序是默认前n个元素是处于有序的,然后逆向遍历,如果前一个元素比后一个元素大,则交换位置,否则跳出本次循环
     *
     * @param array
     */
    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] >= array[j - 1]) {
                    break;
                }
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }

    public static void quickSort(int[] array) {
        qsort(array, 0, array.length - 1);
    }

    private static void qsort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            qsort(array, low, pivot - 1);
            qsort(array, pivot + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
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
//            int temp = array[low];
//            array[low] = array[high];
//            array[high] = temp;
        }
        // 把基准点的数据
        array[low] = pivot;
        return low;
    }

    /**
     * 优化后的冒泡排序,因为冒泡排序是一直比较相邻的两个元素的大小,如果前一个比现在这个元素大就进行交换位置
     * 当一个数组基本上是有序的冒泡排序还是要比较许多次,因此,我们想加一个boolean标识,如果发现上一次比较没有
     * 发生任何改变,说明该数组已经是有序的了,不需要在比较了,便可以直接退出了.
     *
     * @param array
     */
    public void optimizeBubbleSort(int[] array) {
        boolean _continue = true;
        // 总共比较的次数
        for (int i = 0; i < array.length - 1 && _continue; i++) {
            _continue = false;
            // 每次比较前一个与后一个元素
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    _continue = true;
                }
            }
        }
    }

}
