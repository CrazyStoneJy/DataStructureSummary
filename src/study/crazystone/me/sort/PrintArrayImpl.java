package study.crazystone.me.sort;

/**
 * Created by crazystone on 17-2-11.
 */
public class PrintArrayImpl implements IPrintArray{
    @Override
    public void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
