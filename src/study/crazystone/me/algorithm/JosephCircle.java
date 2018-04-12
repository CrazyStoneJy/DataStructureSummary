package study.crazystone.me.algorithm;

/**
 * 约瑟夫环
 * Created by crazystone on 18-4-3.
 */
public class JosephCircle {

    public static void main(String... args) {
        int lastNumber = josephCircle(4);
        System.out.println("last number is:" + lastNumber);
    }

    private static int josephCircle(int range) {

        int[] array = new int[range];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int offset = 1;
        int rest = 0;
        int i = 0;
        int temp = -1;
        while (rest < array.length) {
            i = (++i) % array.length;
            if (array[i] != 0) {
                ++offset;
                if (offset % 3 == 0) {
                    offset = 0;
                    System.out.println("output number is:" + array[i]);
                    temp = array[i];
                    ++rest;
                    array[i] = 0;
                }
            }
        }
        return temp;
    }


}
