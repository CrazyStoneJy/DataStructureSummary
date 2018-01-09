package study.crazystone.me.list;

import java.util.List;

/**
 * 证明一个链表中是否有环
 * Created by crazystone on 18-1-9.
 */
public class Q1 {

    public static void main(String... args) {


    }

    public static boolean judgeRing(List<String> list) {
        for (int i = 0, j = 0; i < list.size(); i++, j += 2) {
            String slow = list.get(i);
            String fast = list.get(j);
            if (slow.equals(fast)) {
                return true;
            }
        }
        return false;
    }


}
