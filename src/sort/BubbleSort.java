package sort;

/**
 * 冒泡算法的原理：
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 * Created by crazystone on 17-2-11.
 */
public class BubbleSort extends PrintArrayImpl{

    /**
     * 懒汉式单列
     */
    private static volatile BubbleSort instance=null;
    private BubbleSort(){};

    public static BubbleSort getInstance(){
        if(instance==null){
            synchronized (BubbleSort.class){
                if(instance==null)
                    instance = new BubbleSort();
            }
        }
        return instance;
    }


    /**
     * 最原始的冒泡排序
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    /**
     * 优化后的冒泡排序算法(增加了一个boolean标志位，如果上次没有元素进行交换，则说明排序已经好，没必要再去比较)
     * @return
     */
    public int[] bubbleSortPro(int[] array){
        boolean isContinue=true;
        for(int i=0;i<array.length-1&&isContinue;i++){
            isContinue=false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    isContinue=false;
                }
            }
        }
        return array;
    }


}
