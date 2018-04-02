package study.crazystone.me.algorithm;

/**
 * 请实现一个函数,输入一个整数,输出该数二进制表示中 1 的个数。例如
 * 把 9 表示成二进制是 1001;有 2 位是 1,因此如果输入 9,函数输出 2.
 * Created by crazystone on 17-2-14.
 */
public class Question5 {

    public static void main(String[] args){

        System.out.println(decimal2Binary(5.2));
        System.out.println("has number:"+hasOne(111));
    }

    public static int hasOne(int number){
        int count=0;
        while(number!=0){
            number/=10;
            if(number%2!=0)count++;
        }
        return count;
    }



    public static String decimal2Binary(double number){
        int quotient;//商
        int remainder;//余数
        StringBuilder sb = new StringBuilder();

        double decimal = number - (int)number;

        int wholeNumber = (int) number;

        while(wholeNumber!=0){
            quotient = wholeNumber/2;
            remainder = wholeNumber%2;
            wholeNumber=quotient;
            sb.append(remainder);
        }
        sb.reverse();
        if(decimal==0)return sb.toString();

        sb.append(".");
        while(decimal !=0){
            decimal*=2;
            if (decimal >= 1) {
                sb.append(1);
                decimal -= 1;
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
    }

}
