package me.crazystone.study.leetcode;

/**
 * first unique character in a string
 * Created by crazystone on 18-4-17.
 */
public class Question387 {

    public static void main(String... args) {
        String string = "leetcode";
        int index = firstUniqueChar2(string);
        System.out.println("find the first unique element index is:" + index);
    }

    /**
     * 时间复杂度为O(n2)
     *
     * @param string
     * @return
     */
    private static int firstUniqueChar(String string) {
        if (string == null || string.length() == 0) {
            return -1;
        }
        if (string.length() == 1) {
            return 0;
        }
        int index = 0;
        boolean isUnique = false;
        while (index < string.length()) {
            int i = 0;
            for (i = 0; i < string.length(); i++) {
                if (index == i) {
                    continue;
                }
                char cmpChar = string.charAt(index);
                char current = string.charAt(i);
                if (cmpChar == current) {
                    isUnique = false;
                    break;
                } else {
                    isUnique = true;
                }
            }
            if (i == string.length() && isUnique) {
                return index;
            }
            ++index;
        }
        return -1;
    }

    /**
     * 时间复杂度为:O(n)
     * 空间复杂度:26
     *
     * @param s
     * @return
     */
    private static int firstUniqueChar2(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alphabet[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void test() {
        String[] array = {"w", "wds", "asd"};
        int i = 0;
        for (i = 0; i < array.length; i++) {
            String s = array[i];
        }
        System.out.println("i is:" + i);
    }

}
