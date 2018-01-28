package study.crazystone.me.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by crazystone on 18-1-16.
 */
public class HashMapTest {
    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String... args) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 16; i++) {
            String key = "name" + i;
            map.put(key, "values");
        }

        TreeMap<String, String> treeMap;
        LinkedHashMap<String, String> linkedHashMap;
        List<String> list = new ArrayList<>();
        HashMap<String, String> hashMap;
        Hashtable<String, String> table;
        ConcurrentHashMap<String, String> conmap;
        int max = Integer.MAX_VALUE;
        Integer i;


//        map.put("name","jiayan");
//        String value = map.get("/usr/local/java/jdk1.8.0_111/jre");
//        System.out.println(value);

        // resize方法中 preserve order拉链　原理
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
