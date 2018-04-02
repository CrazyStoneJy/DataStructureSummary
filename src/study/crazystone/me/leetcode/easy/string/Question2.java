package study.crazystone.me.leetcode.easy.string;

import study.crazystone.me.utils.Logs;

/**
 * Created by crazystone on 18-3-17.
 */
public class Question2 {

//    Given a 32-bit signed integer, reverse digits of an integer.
//            Example 1:
//
//    Input: 123
//    Output:  321
//    Example 2:
//
//    Input: -123
//    Output: -321
//    Example 3:
//
//    Input: 120
//    Output: 21
//    Note:
//    Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

    public static void main(String... args) {
        int num = 234;
        int newNum = reverse(num);
        Logs.l(newNum);
//        System.out.printf("this number is %d,my name is %s",12,"jiayan");
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = result * 10 + tail;
            // 注意:判断反转的过程中,数字数否大于Integer.MAX_VALUE的语句,是:(当前的数-余数)/10=上个数,这表示没有越界.
            if ((newRes - tail) / 10 != result) {
                return 0;
            }
            result = newRes;
            x /= 10;
        }
        return result;
    }

}
