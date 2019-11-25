package me.crazystone.study.algorithm;

import java.util.Stack;

/**
 * Created by crazystone on 18-1-26.
 */
public class JudgeBinary {


    public static void main(String... args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 2; i < 20; i++) {
//            list.add(i);
//        }
//        for (Integer i : list) {
////            System.out.println(i + "->" + isBinarySqrt(i));
//            System.out.println(i + "->" + binary(i) + "->" + getOneOfNumber(i));
//        }
        int a = 023;
        int b = 034;

        System.out.println("a:" + binary(a) + ",b:" + binary(b) + ",异或：" + binary(a ^ b));

    }

    /**
     * 一个数是否是２的幂指数
     * 判断
     *
     * @param number judge number
     * @return number is index of 2
     */
    public static boolean isBinarySqrt(int number) {
        return (number & (number - 1)) == 0;
    }

    /**
     * 获取一十进制转为二进制数字中1的个数
     * 这个时间复杂度为:Ｏ(n)
     *
     * @param number
     * @return
     */
    public static int getOneOfNumber(int number) {
        int num = number;
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    /**
     * 获取一十进制转为二进制数字中1的个数,优化的算法
     * 最差时间复杂度为：Ｏ(n)
     * 最优时间复杂度为:Ｏ(1)
     *
     * @param number
     * @return
     */
    public static int getOneOfNumber2(int number) {
        int count = 0;
        while (number != 0) {
            number &= number - 1;
            ++count;
        }
        return count;
    }


    /**
     * decimal to binary
     *
     * @param number the decimal number
     * @return the result of number is binary number
     */
    public static String binary(int number) {
        if (number == 0) {
            return "0";
        }
        int num = number;
        StringBuilder output = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            int res = num % 2;
            stack.push(res);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            int n = stack.pop();
            output.append(n);
        }
        return output.toString();
    }


}
