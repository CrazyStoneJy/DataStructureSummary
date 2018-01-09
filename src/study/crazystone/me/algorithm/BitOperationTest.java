package study.crazystone.me.algorithm;

import java.util.Calendar;

/**
 * Created by crazystone on 17-7-20.
 */
public class BitOperationTest {

    public static void main(String... args) {
//        System.out.println("输入一个整数,判断是否是2的平方?");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(isPowerOf2(number));

//        System.out.println(0x10 & 0x100);
//        System.out.println(Integer.MAX_VALUE << 1);
//        System.out.println(count(7));
        cal();
    }


    private static void cal() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("date:" + calendar.get(Calendar.DATE));
        System.out.println("year:" + calendar.get(Calendar.YEAR));
        System.out.println("month:" + calendar.get(Calendar.MONTH));
        System.out.println("week:" + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("dayOfMonth:" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("dayOfWeek:" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("dayOfWeekInMonth:" + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("dayOfYear:" + calendar.get(Calendar.DAY_OF_YEAR));
        calendar.set(2017,6,1);
        System.out.println("getFirstDayOfWeek:" + calendar.get(Calendar.DAY_OF_WEEK));

    }

    /**
     * 判断一个数是否是2的平方,算法复杂度O(1)
     *
     * @param number
     * @return
     */
    public static boolean isPowerOf2(int number) {
        return (number & (number - 1)) == 0;
    }

    /***
     * 判断一个整数转为2进制数,1的个数
     * @param number
     * @return
     */
    public static int count(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }


}
