package me.crazystone.study.leetcode.easy.string;

import me.crazystone.study.utils.Logs;

import java.util.LinkedHashMap;

/**
 * Created by crazystone on 18-3-17.
 */
public class Question1 {

    public static void main(String... args) {

        String string = "hello";
        Logs.l(string);
        String reverseString = reverseString(string);
        Logs.l(reverseString);
        LinkedHashMap map;
    }

    private static String reverseString(String string) {
        char[] array = string.toCharArray();
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            ++start;
            --end;
        }
        return new String(array);
    }

}
