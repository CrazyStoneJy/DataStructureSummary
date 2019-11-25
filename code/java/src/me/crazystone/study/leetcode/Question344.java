package me.crazystone.study.leetcode;

import me.crazystone.study.utils.Logs;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 * <p>
 * Created by crazystone on 18-3-13.
 */
public class Question344 {

    public static void main(String... args) {

        String string = "hello";
        Logs.l(reverse(string));
        Logs.l(reverse2(string));

    }

    /**
     * 逆序
     *
     * @param string
     * @return
     */
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 使用二分法
     *
     * @param string
     * @return
     */
    public static String reverse2(String string) {
        char[] array = string.toCharArray();
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return new String(array);
    }


}
