package study.crazystone.me.sort_upate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 桶排序、基数排序
 * Created by crazystone on 2016/3/12.
 */
// TODO: 2016/3/12
public class RadixSort<E extends Comparable<E>> {

    private static final int NUMBER = 10;
    private List<E> buckts = new ArrayList<E>();//装在每个基数的桶（暂且是10进制的）

    public static <E extends Comparable<E>> void sort(E[] array) {
        if (array[0] instanceof Number) {


        } else {
            throw new IllegalStateException("now radix sort must be number");
        }
    }


}
