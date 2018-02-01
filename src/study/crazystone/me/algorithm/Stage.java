package study.crazystone.me.algorithm;

import study.crazystone.me.utils.Logs;

/**
 * 有十个台阶,一步或两步走,上楼梯有几种上法?
 * Created by crazystone on 18-2-1.
 */
public class Stage {

    public static void main(String... args) {

        Logs.l(stage(10));
        Logs.l(stage2(10));

    }

    /**
     * 递归的算法(如果已经走了9步,还有一格,那就只有一种走法;如果已经走了8格,那有两种情况,一步一步走和直接走两步)
     *
     * @param stage_number 要走的台阶数
     * @return
     */
    private static int stage(int stage_number) {
        if (stage_number == 1) {
            return 1;
        }
        if (stage_number == 2) {
            return 2;
        }
        return stage(stage_number - 1) + stage(stage_number - 2);
    }


    private static int stage2(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 2;
        }
        int case1 = 1;
        int case2 = 2;

        for (int i = 3; i <= number; i++) {
            // 保存上一次的求和
            int temp = case2;
            case2 = case1 + case2;
            case1 = temp;
        }
        return case2;
    }


}
