package me.crazystone.study.leetcode;

import me.crazystone.study.utils.Logs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 18-3-14.
 */
public class Question202 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String... args) {

        happyNumber(19);

    }

    private static boolean happyNumber(int number) {
        list.clear();
        while (number != 0) {
            int temp = number % 10;
            list.add(temp);
            number /= 10;
        }
        int sum = 0;
        Logs.l(list);
        for (Integer num : list) {
            sum += Math.pow(num, 2D);
        }
        if (sum == 1) {
            return true;
        } else {
            happyNumber(sum);
        }
        return false;
    }


}
