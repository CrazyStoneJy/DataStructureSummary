package me.crazystone.study.leetcode;

import me.crazystone.study.utils.Logs;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 * <p>
 * Created by crazystone on 18-3-13.
 */
public class Question371 {

    public static void main(String... args) {
        int a = 2;
        int b = 3;
        Logs.l(a & b);
        Logs.l(a | b);
        add(a, b);
    }

    private static int add(int a, int b) {
        return a | b;
    }


}
