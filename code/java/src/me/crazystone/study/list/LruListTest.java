package me.crazystone.study.list;

import me.crazystone.study.utils.Logs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by crazystone on 18-4-11.
 */
public class LruListTest {

    public static void main(String... args) {
        Random random = new Random();
        LinkedList l;
        LruList<String> lruList = new LruList<>(3);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals("y")) {
                int rand = random.nextInt(10);
                String value = "value" + rand;
                Logs.l("the new value is:" + value);
                lruList.addElement(value);
                printList(lruList);
            }
        }
    }

    private static void printList(java.util.List<String> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> {
            sb.append(s).append(",");
        });
        Logs.l(sb);
    }

}
