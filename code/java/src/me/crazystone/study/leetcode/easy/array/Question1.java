package me.crazystone.study.leetcode.easy.array;

import me.crazystone.study.utils.Logs;
import me.crazystone.study.utils.Printer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by crazystone on 18-3-16.
 */
public class Question1 {

    public static void main(String... args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4};
        Printer.intArray(array);
        removeDuplicates(array);
        Printer.intArray(array);
//        Logs.l(-1&2);

    }


    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int size = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
    }

}
