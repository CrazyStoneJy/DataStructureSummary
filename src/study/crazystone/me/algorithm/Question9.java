package study.crazystone.me.algorithm;

/**
 * Created by crazystone on 17-2-14.
 */
public class Question9 {

    public static void main(String[] args){
        System.out.print(f(9));
    }

    public static int f(int n){
        if(n==1||n==2)return 1;
        return f(n-1)+f(n-2);
    }

}
