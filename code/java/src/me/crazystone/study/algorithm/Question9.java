package me.crazystone.study.algorithm;

import me.crazystone.study.utils.Logs;

/**
 * Created by crazystone on 18-3-22.
 */
public class Question9 {

    public static void main(String... args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 1;
        Logs.l(binarySearch(num, array));

    }

    private static boolean binarySearch(int searchNumber, int[] nums) {
        return search(0, nums.length - 1, searchNumber, nums);
    }

    private static boolean search(int start, int end, int searchNumber, int[] nums) {
        int count = 0;
        while (start < end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == searchNumber) {
                Logs.l("查询的次数:" + count);
                return true;
            } else if (searchNumber < nums[mid]) {
                end = mid;
            } else if (searchNumber > nums[mid]) {
                start = mid;
            }
            ++count;
        }
        Logs.l("查询的次数:" + count);
        return false;
    }

}
