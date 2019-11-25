package me.crazystone.study.algorithm;

/**
 * 题 面试题 3 :二维数组中的查找
 * 题目描述:一个二维数组,每一行从左到右递增,每一列从上到下递增.输
 * 入一个二维数组和一个整数,判断数组中是否含有整数。
 * Created by crazystone on 17-2-14.
 */
public class Question1 {

    public static void main(String[] args){
        int[][] array=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println(hasThisNumber(array,9));

    }

    public static boolean hasThisNumber(int[][] array,int number){
        int rowNumber = array.length-1;
        int columnNumber = array[0].length-1;
        if(number<array[0][0]||number>array[rowNumber][columnNumber])return false;
        int row = 0;
        int column = columnNumber;
        while(row<=rowNumber&&column>=0){
            if(array[row][column]==number)return true;
            if(array[row][column]>number){
                column--;
            }else{
                row++;
            }
        }

        return false;
    }


}
