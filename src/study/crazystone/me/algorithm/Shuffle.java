package study.crazystone.me.algorithm;

import study.crazystone.me.utils.Logs;

import java.util.Random;

/**
 * Created by crazystone on 18-3-9.
 */
public class Shuffle {

    static Random random = null;

    public static void main(String... args) {

        random = new Random();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        print(array);
        shuffle(array);
        print(array);
    }

    private static void print(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }

    private static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i);
            Logs.l("随机的index:" + i);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }


}
