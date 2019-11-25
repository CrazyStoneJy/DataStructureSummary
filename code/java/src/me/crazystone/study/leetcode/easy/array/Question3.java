package me.crazystone.study.leetcode.easy.array;

import me.crazystone.study.utils.Printer;

/**
 * Created by crazystone on 18-3-16.
 */
public class Question3 {

    public static void main(String... args) {

        int[] nums = {1, 2,};
        Printer.intArray(nums);
        rotate(nums, 2);
        Printer.intArray(nums);

    }

    private static void rotate(int[] nums, int k) {
        if (k < 0) return;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        }
    }


}
