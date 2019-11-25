package me.crazystone.study.test;

import me.crazystone.study.utils.Logs;

import java.util.*;

/**
 * Created by crazystone on 17-7-27.
 */
public class TestExecute {


    static {
        System.out.println("静态代码块");
    }

    String str;

    {
        System.out.println("普用代码块");
        str = "HelloWorld";
    }

    public TestExecute() {
        System.out.println("无参构造函数");
    }

    public static void test() {
        System.out.println("test静态函数");
    }

    public static void main(String... args) {

        TestExecute testExecute = new TestExecute();
        testExecute.print();
        System.out.println(testExecute.str);
        System.out.println(">>>>>>>>>>>>>>>>>>");
        TestExecute testExecute1 = new TestExecute();
        System.out.println(">>>>>");
        TestExecute.test();

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern());

        Logs.l(~2);
//       String string = "";
        Map<Integer, Integer> map = null;
        map.containsKey(1);
//        System.arraycopy();
    }

    public void print() {
        System.out.println("print函数");
    }


}
