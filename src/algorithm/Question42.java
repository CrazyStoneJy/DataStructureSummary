package algorithm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by crazystone on 17-2-18.
 */
public class Question42 {

    public static void main(String[] args) {
        String str = "i am a student.";
        String reverseString = reverseString(str);
        System.out.println(reverseString);

        Hashtable hashtable;
        HashMap map;

    }

    public static String reverseString(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            stack.push((String) stringTokenizer.nextElement());
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if(!stack.isEmpty())sb.append(" ");
        }

        return sb.toString();
    }


}
