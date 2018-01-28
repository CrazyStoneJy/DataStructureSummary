package study.crazystone.me.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by crazystone on 18-1-26.
 */
public class Question67 {

    public static void main(String... args) {
        List<String> list1 = generateBinaryList(20);
        List<String> list2 = generateBinaryList(20);

        System.out.println(list1);
        System.out.println(list2);
        System.out.print("[");
        for (int i = 0; i < 20; i++) {
            String a = list1.get(i);
            String b = list2.get(i);
            System.out.print(addBinary(a, b));
            System.out.print(", ");
        }
        System.out.print("]");

//        String a = "110";
//        String b = "011";
//        addBinary(a, b);


//        System.out.println(addBinary());
    }

    public static List<String> generateBinaryList(int size) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String binaryString = randBinaryString();
            list.add(binaryString);
        }
        return list;
    }


    public static String addBinary(String a, String b) {
        int i = 0;
        char[] aChars = a.toCharArray();
        char[] bChar = b.toCharArray();

        int size = aChars.length > bChar.length ? aChars.length : bChar.length;

//        for(int i=0;i<s){
//
//        }



        return "";
//        return string2int(a) + string2int(b);
    }

    public static int string2int(String str) {
        int number = 0;
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            int num = chars[j] - 48;
            number += num * Math.pow(2, i);
        }
        return number;
    }

    public static String randBinaryString() {
        Random random = new Random();
        int size = random.nextInt(4);
        StringBuilder sb = new StringBuilder();
        if (size == 0) {
            return random.nextBoolean() ? "0" : "1";
        }
        for (int i = 0; i < size; i++) {
            sb.append(random.nextBoolean() ? "0" : "1");
        }
        return sb.toString();
    }


}
