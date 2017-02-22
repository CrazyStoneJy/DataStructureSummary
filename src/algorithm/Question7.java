package algorithm;

import org.omg.CORBA.Object;

import java.util.Stack;

/**
 * Created by crazystone on 17-2-14.
 */
public class Question7 {

    public static void main(String[] args){

    }

    static class Queue{
       static Stack<Object> prons  = new Stack<>();
        static Stack<Object> cons = new Stack<>();

        public static void addHead(Object object){
            prons.push(object);
            while(!prons.isEmpty()){
                cons.push(prons.pop());
            }
        }

        public static void remove(Object object){
            Object node = cons.pop();
        }


    }


}
