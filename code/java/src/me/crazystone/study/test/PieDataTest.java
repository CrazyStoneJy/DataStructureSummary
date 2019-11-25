package me.crazystone.study.test;

import java.util.Random;

/**
 * Created by crazystone on 17-7-20.
 */
public class PieDataTest {

    public static final int TOTAL = 100;

    public static void main(String... args) {
        Random random = new Random();

        int hasAllocate = 0;
        int size = random.nextInt(10);
        size = size == 0 ? 1 : size;
        for (int i = 0; i < size; i++) {
            int current = 0;
            if (i == size - 1) {
                current = TOTAL - hasAllocate;
                hasAllocate = TOTAL;
            } else {
                current = random.nextInt(TOTAL - hasAllocate);
                hasAllocate += current;
            }
            System.out.println("number:" + current);
        }


    }


}
