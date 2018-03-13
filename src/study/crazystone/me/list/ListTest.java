package study.crazystone.me.list;

import study.crazystone.me.utils.Logs;

import java.util.ArrayList;

/**
 * Created by crazystone on 18-1-26.
 */
public class ListTest {


    public static void main(String... args) {

        java.util.List<String> list = new ArrayList<>();

        int[] intArray = new int[]{1, 2, 3, 4};
        int[] newArray = new int[10];
        System.arraycopy(intArray, 2, newArray, 0, intArray.length - 2);

        for (int i : newArray) {
            Logs.l(i);
        }

        ClassLoader loader;

        Math.sqrt(23F);
    }


    class TestClassLoader extends ClassLoader {

    }


}
