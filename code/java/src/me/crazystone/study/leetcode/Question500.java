package me.crazystone.study.leetcode;

import me.crazystone.study.utils.Logs;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by crazystone on 18-4-12.
 */
public class Question500 {

    private static char[][] alphabet = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
            {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'},
            {'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
    private static Pattern pattern = Pattern.compile("[A-Z]");

    public static void main(String... args) {
        String[] array = {"Hello", "Alaska", "Dad", "Peace"};
        printArray(array);
        String[] words = findWords(array);
        Logs.l("after filter>>>");
        printArray(words);
    }

    private static void testUpper() {
        String string = "AsdfsdA";
        for (char c : string.toCharArray()) {
            Logs.l(c + "," + isUpper(c));
        }
    }

    private static String[] findWords(String[] words) {
        java.util.List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            if (chars.length > 0) {
                int lastRow = findRow(chars[0]);
                boolean isOneLine = true;
                for (char c : chars) {
                    int currentRow = findRow(c);
                    if (currentRow >= 0) {
                        if (lastRow != currentRow) {
                            isOneLine = false;
                            break;
                        }
                        lastRow = currentRow;
                    } else {
                        throw new RuntimeException("this char is not in alphabet");
                    }
                }
                if (isOneLine) {
                    list.add(word);
                }
            }
        }
        return parse(list);
    }


    private static String[] parse(java.util.List<String> list) {
        if (list != null && list.size() > 0) {
            String[] objs = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                String obj = list.get(i);
                objs[i] = obj;
            }
            return objs;
        }
        return null;
    }

    /**
     * 查找char是对应的哪个alphabet的row上.
     * 注意:将大写的char转为小写的再比较
     *
     * @param c
     * @return
     */
    private static int findRow(char c) {
        char newChar = isUpper(c) ? (char) (c + 32) : c;
        for (int i = 0; i < alphabet.length; i++) {
            char[] rows = alphabet[i];
            for (char col : rows) {
                if (col == newChar) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean isUpper(char c) {
        Matcher matcher = pattern.matcher(new String(new char[]{c}));
        return matcher.matches();
    }

    private static void printArray(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (String string : array) {
            sb.append(string);
            sb.append(",");
        }
        sb.append("]");
        Logs.l(sb);
    }

}
