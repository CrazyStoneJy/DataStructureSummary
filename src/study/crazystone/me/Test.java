package study.crazystone.me;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String... args) {

//        String s3 = new String("aaa");
//        String s1 = "aaa";
//        String s2 = "aaa";
//        String s4 = new String("aaa");
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        System.out.println(s3 == s4);
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3));
//        System.out.println(s3.equals(s4));
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//
//        Person p1 = new Person("jiayan", "北京");
//        Person p2 = new Person("jiayan", "das");
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1 == p2);
//
//        Map<String,String> map = new HashMap<>();
//        map.put("aa","bbb");

        System.out.println(supplementalHash(12));
        System.out.println(supplementalHash(123));
        System.out.println(supplementalHash(345));
        System.out.println(supplementalHash(6754654));


    }

    private static int supplementalHash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(">>>>>" + h);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

}
