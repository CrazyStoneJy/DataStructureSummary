package test.chapter21;

import java.util.Comparator;

/**
 * 使用二分查找法实现下面的方法
 * public static <E extends Comparable<E>> int binarySearch(E[] list,E key)
 * Created by crazystone on 17-2-26.
 */
public class Question2 {

    public static void main(String... args) {

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("standard:" + binarySearch(intArray, 9, Type.STANDARD));
        System.out.println("recursive:" + binarySearch(intArray, 1, Type.RECURSIVE));
        System.out.println("compare times:" + compareTimes(intArray, 3));
    }

    public enum Type {
        STANDARD,
        RECURSIVE;
    }


    /**
     * 首先要实现二分查找，这个数组必须是个有序的数组
     *
     * @param list
     * @param key
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key, Type type) {
        switch (type) {
            case STANDARD:
                return search2(list, key, 0, list.length - 1);
            case RECURSIVE:
                return search(list, key, 0, list.length - 1);
            default:
                return -1;
        }
    }

    /**
     * 方法一：使用递归的方式
     *
     * @param list
     * @param key
     * @param low
     * @param high
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int search(E[] list, E key, int low, int high) {
        if (low <= high) {
            int mid = (low + high) >> 1;
            E midValue = list[mid];
            if (midValue.compareTo(key) == 0) {
                return mid;
            } else if (key.compareTo(midValue) > 0) {
                return search(list, key, ++mid, high);
            } else if (key.compareTo(midValue) < 0) {
                return search(list, key, low, --mid);
            }
        }
        return -1;
    }

    /**
     * 非递归的方法
     *
     * @param list
     * @param key
     * @param low
     * @param high
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int search2(E[] list, E key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) >> 1;
            E midValue = list[mid];
            if (key.compareTo(midValue) == 0) {
                return mid;
            } else if (key.compareTo(midValue) > 0) {
                low = ++mid;
            } else if (key.compareTo(midValue) < 0) {
                high = --mid;
            }
        }
        return -1;
    }

    /**
     * 二分法比较的次数
     *
     * @param list
     * @param key
     * @param <E>
     * @return
     */
    public static <E extends Comparable<E>> int compareTimes(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;
        int count = 0;

        while (low <= high) {
            count++;
            int mid = (low + high) >> 1;
            E midValue = list[mid];
            if (key.compareTo(midValue) == 0) {
                break;
            } else if (key.compareTo(midValue) > 0) {
                low = ++mid;
            } else if (key.compareTo(midValue) < 0) {
                high = --mid;
            }
        }
        return count;
    }

}
