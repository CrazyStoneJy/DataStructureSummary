package com.crazystone.datastructure.sort;

import com.crazystone.datastructure.sort.heap.HeapSort;

import java.util.*;

/**
 * Created by crazystone on 2016/3/4.
 */
public class SortTest {

    public static void main(String[] agrs) {

        SortUtils.sort(getArray(), SortType.BUBBLE);
        System.out.println(">>>>>>>>>>>>>>");
        SortUtils.sort(getArray(), SortType.HEAP);
        System.out.println(">>>>>>>>>>>>>>");
        SortUtils.sort(getArray(), SortType.INSERTION);
        System.out.println(">>>>>>>>>>>>>>");
        SortUtils.sort(getArray(), SortType.SELECTION);
        System.out.println(">>>>>>>>>>>>>>");
        SortUtils.sort(getArray(), SortType.QUICK);

    }

    /**
     * 获取一个（0~100）整型的随机数
     *
     * @return
     */
    public static int getRandomNumber() {
        return new Random().nextInt(100);
    }

    /**
     * 生成一个整型的随机数组
     *
     * @return Integer[]
     */
    public static Integer[] getArray() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();
        }
        return array;
    }


}
