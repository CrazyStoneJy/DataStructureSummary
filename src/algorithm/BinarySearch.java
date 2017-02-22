package algorithm;

/** 二分查找
 * Created by crazystone on 17-2-20.
 */
public class BinarySearch {

    public static void main(String... args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("seach result:"+search(array,9,0,array.length-1));
        System.out.println("seach2 result:"+search2(array,9,0,array.length-1));
    }

    public static int search(int[] array, int target, int low, int high) {

        if(low<=high){
            int mid = (low+high)/2;
            int midElement = array[(low+high)/2];
            if(midElement==target){
                return midElement;
            }else if(midElement>target){
                return search(array,target,low,--mid);
            }else if(midElement<target){
                return search(array,target,++mid,high);
            }
        }
        return -1;
    }

    public static int search2(int[] array,int target,int low,int high){
        while(low<=high){
            int mid = (high+low)/2;
            int element = array[mid];
            if(target==element){
                return element;
            }else if(target<element){
                high=--mid;
            }else if(target>element){
                low=++mid;
            }
        }
        return -1;
    }


}
