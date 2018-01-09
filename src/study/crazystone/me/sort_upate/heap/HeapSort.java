package study.crazystone.me.sort_upate.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆排序
 * Created by crazystone on 2016/3/4.
 */
public class HeapSort<E extends Comparable> {

    public static <E extends Comparable<E>> E[] sort(E[] list) {
        BigHeap heap = new BigHeap(list);
//        heap.printHeap();
//        List<E> newList = new ArrayList<E>();
//        E[] after = (E[]) new Comparable[list.length];
//        int index = 0;
        for (int i = list.length - 1; i >= 0; i--) {
//            list[i] = (E) heap.remove();
//            newList.add(list[i]);
//            after[index] = (E) heap.remove();
//            index++;
            list[i]= (E) heap.remove();
        }


        return list;
    }

}
