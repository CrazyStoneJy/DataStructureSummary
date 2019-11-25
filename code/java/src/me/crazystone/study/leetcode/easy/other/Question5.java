package me.crazystone.study.leetcode.easy.other;

import me.crazystone.study.utils.Logs;

/**
 * Created by crazystone on 18-3-20.
 */
public class Question5 {

    public static void main(String... args) {

        int[] array = {0, 1, 3};
        Logs.l(missingNumber(array));

        String string = "";
        StringBuilder sb = new StringBuilder(string);

    }

    /**
     * 原理是用 a = a ^ b ^ b
     *
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int temp = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            temp = temp ^ i ^ nums[i];
        }
        return temp ^ i;
    }


}
