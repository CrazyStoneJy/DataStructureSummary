package me.crazystone.study.test;

import me.crazystone.study.utils.Logs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by crazystone on 18-3-14.
 */
public class CollectionTest {

    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("value" + i);
        }
    }

}
