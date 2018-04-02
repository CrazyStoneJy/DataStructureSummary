package study.crazystone.me.list;

import study.crazystone.me.utils.Logs;

import java.util.*;

/**
 * Created by crazystone on 18-1-26.
 */
public class ListTest {


    public static void main(String... args) {

        java.util.List<String> list = new ArrayList<>();
        java.util.List<String> li = new LinkedList<>();

        int[] intArray = new int[]{1, 2, 3, 4, 0, 0};
        int[] newArray = new int[10];
        System.arraycopy(intArray, 2, intArray, 2 + 1, 4-2);
        intArray[2] = 90;

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < intArray.length; i++) {
            sb.append(intArray[i]);
            if (i != intArray.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        Logs.l(sb);

    }


}
