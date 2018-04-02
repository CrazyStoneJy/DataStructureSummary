package study.crazystone.me.algorithm;

/**
 * Created by crazystone on 18-4-2.
 */
public class PrimeNumber {

    public static void main(String... args) {
        findPrime(100);
    }

    /**
     * 找出[1,range)之间的素数
     *
     * @param range 数的范围
     */
    private static void findPrime(int range) {
        int j = 2;
        for (int i = 2; i < range; i++) {
            for (j = 2; j <= Math.sqrt(i); j++) {
                // 判断在[2,Math.sqrt(i)]范围中是否数值能将其整除,如果能整除则说明该number不是素数,即跳过.
                if (i % j == 0) {
                    break;
                }
            }
            if (j > Math.sqrt(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }


}
