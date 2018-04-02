package study.crazystone.me.leetcode.easy.string;

import study.crazystone.me.utils.Logs;

/**
 * Created by crazystone on 18-3-18.
 */
public class Question8 {

    public static void main(String... args) {
        String[] strs = {"abasd", "a"};
        String output = longestCommonPrefix(strs);
        Logs.l(output);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int index = 0;
        while ((index < strs[0].length())) {
            char temp = strs[0].charAt(index);
            for (int i = 1; i < strs.length; i++) {
                String str = strs[i];
                if (index >= str.length() || temp != str.charAt(index)) {
                    return "has no value";
                }
            }
            index++;
        }
        return strs[0].substring(0, index - 1);
    }


}
