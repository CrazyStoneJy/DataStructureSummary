package study.crazystone.me.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by crazystone on 18-1-16.
 */
public class HashMapTest {

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

    }


}
