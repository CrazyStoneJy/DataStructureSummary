package me.crazystone.study.sort_upate.heap;

import java.util.Comparator;
import java.util.List;

/**
 * 大根堆的实现
 * Created by crazystone on 2016/3/4.
 */
public class BigHeap<E extends Comparable> extends AbstractHeap<E> {


    public BigHeap() {
    }

    public BigHeap(List<E> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        mList = list;
    }

    public BigHeap(E[] array) {
        for (E e : array) {
            add(e);
        }
    }

    @Override
    public void add(E e) {
        mList.add(e);
        int curIndex = mList.size() - 1;

        while (curIndex > 0) {
            int parentIndex = (curIndex - 1) / 2;
            if (mList.get(curIndex).compareTo(mList.get(parentIndex)) > 0) {
                E temp = mList.get(curIndex);
                mList.set(curIndex, mList.get(parentIndex));
                mList.set(parentIndex, temp);
            } else {
                break;
            }
            curIndex = parentIndex;
        }
    }

    @Override
    public E remove() {

        E removeObj = mList.get(0);//堆顶的数值
        mList.set(0, mList.get(getSize() - 1));//将堆中末尾的元素放到堆顶
        mList.remove(getSize() - 1);//删除最后一个元素

        int curIndex = 0;
        while (curIndex < mList.size()) {
            int leftIndex = curIndex * 2 + 1;//堆的左孩子索引
            int rightIndex = curIndex * 2 + 2;//堆得右孩子索引
            if (leftIndex >= mList.size()) break;
            int maxIndex = leftIndex;//找出parent节点下的最大值（比较左右节点）
            if (rightIndex < mList.size()) {
                if (mList.get(rightIndex).compareTo(mList.get(maxIndex)) > 0) {
                    maxIndex = rightIndex;
                }
            }
            //parent值与孩子的最大值替换
            if (mList.get(curIndex).compareTo(mList.get(maxIndex)) < 0) {
                E temp = mList.get(curIndex);
                mList.set(curIndex, mList.get(maxIndex));
                mList.set(maxIndex, temp);
                curIndex = maxIndex;
            } else {
                break;
            }
        }
        return removeObj;
    }
}
