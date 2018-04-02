package study.crazystone.me.leetcode.easy.array;

import study.crazystone.me.utils.Logs;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by crazystone on 18-3-16.
 */
public class Question4 {

    public static void main(String... args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 4};
        boolean distinct = containsDuplicate(nums);
        Logs.l(distinct);
//        Logs.l(~3);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
