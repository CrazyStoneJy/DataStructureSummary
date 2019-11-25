package me.crazystone.study.utils;

import javax.print.DocFlavor;
import java.util.Objects;

/**
 * Created by crazystone on 18-3-16.
 */
public class Printer {

    public static void intArray(int[] array) {
        if (array == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        Logs.l(sb.toString());
    }

    public static void array(Object[] objects) {
        if (objects == null) return;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < objects.length; i++) {
            sb.append(objects[i].toString());
            if (i == objects.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        Logs.l(sb.toString());
    }


}
