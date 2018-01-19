package study.crazystone.me.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by crazystone on 18-1-16.
 */
public class HashMapTest {
    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String... args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(tableSizeFor(1 << 4));
        Set<String> set = new HashSet<>();
        set.add("aa");
    }

    //根据期望容量cap，返回2的n次方形式的 哈希桶的实际容量 length。 返回值一般会>=cap
    static final int tableSizeFor(int cap) {
        //经过下面的 或 和位移 运算， n最终各位都是1。
        int n = cap - 1;
        n |= n >>> 1;
        print(n);
        n |= n >>> 2;
        print(n);
        n |= n >>> 4;
        print(n);
        n |= n >>> 8;
        print(n);
        n |= n >>> 16;
        print(n);
        //判断n是否越界，返回 2的n次方作为 table（哈希桶）的阈值
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    static void print(Object object) {
//        if(String.class.isInstance(object))
        System.out.println(object.toString());
    }


}
