package study.crazystone.me.algorithm;

/**
 * 判断字符串是否为回文，若是，则返回1，否则返回0。例如字符串LEVEL是回文，而字符串123312就不是回文
 * <p>
 * Created by crazystone on 18-3-21.
 */
public class Question8 {

    public static void main(String... args) {

        String[] strings = {"123231", "123321", "LEVEL", "ABCB"};
        for (String string : strings) {
            System.out.println(string + " can reverse " + (judgeReverseString(string) ? "success" : "fail"));
        }

    }

    private static boolean judgeReverseString(String string) {
        int start = 0;
        int end = string.length() - 1;
        while (start < end) {
            char head = string.charAt(start);
            char tail = string.charAt(end);
            if (head != tail) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }


}
