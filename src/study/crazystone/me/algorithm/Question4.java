package algorithm;

/**
 * Created by crazystone on 17-2-14.
 */
public class Question4 {

    public static void main(String[] args){
        String str="i am a chinese";
        System.out.println(replaceString(str));
    }

    public static String replaceString(String target){
       return target.replaceAll(" ","%20");
    }



}
