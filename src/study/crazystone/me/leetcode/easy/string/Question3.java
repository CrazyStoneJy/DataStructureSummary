package study.crazystone.me.leetcode.easy.string;

/**
 * Created by crazystone on 18-3-18.
 */
public class Question3 {

    public static void main(String... args) {


    }

    private static String filterString(String string) {
        if (string == null) return null;
        char temp = 0;
        char[] chars = string.toCharArray();
        int size = string.length();
        for (int i = 0; i < size; i++) {
            char str = chars[i];
            if (str == temp) {
//                chars[]
                --size;
            }
            temp = str;
        }
String str = "";
//        str.substring()
        return null;
    }


}
