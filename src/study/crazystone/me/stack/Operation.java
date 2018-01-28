package study.crazystone.me.stack;


import study.crazystone.me.utils.Logs;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 中缀表达式转后缀表达式->逆波兰式
 * Created by crazystone on 18-1-28.
 */
public class Operation {

    private static Character[] operationArray = {'+', '-', '/', '*'};

    private static List<Character> operations = Arrays.asList(operationArray);

    public static void main(String... args) {
        String operation = "2+3-5*(2-1+3)";
        String postfix = shuntingYard(operation);
        Logs.l(postfix);
        Logs.l(calculate(postfix));
        String expression = "{([)}";
        Logs.l(judgeExpression(expression));

    }


    /**
     * 中缀表达式转后缀表达式
     * 1.如果是操作数直接append到字符串后
     * 2.如果是(将其压入到操作符栈中
     * 3.如果是)则将栈先前遍历直到出现(字符为止,将弹出的操作符append到字符串后
     * 4.如果是操作符,需要比较该操作符与栈顶的操作符,如果该操作符比栈顶的操作符优先级高则将该操作符加入栈顶;否则循环弹出栈顶操作符直到该操作符比栈顶操作符优先级高为止.
     * 5.遍历完成后，如果操作栈中还有操作符,则将其循环pop直到栈为空为止.
     *
     * @param operationString 　中缀表达式字符串
     * @return 后缀表达式即逆波兰式
     */
    private static String shuntingYard(String operationString) {
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] array = operationString.toCharArray();
        for (char a : array) {
            if (a >= '0' && a <= '9') {
                output.append(a);
            } else if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                char c;
                while (!stack.isEmpty()) {
                    if ((c = stack.pop()) == '(') {
                        break;
                    }
                    output.append(c);
                }
            } else if (operations.contains(a)) {
                while (!stack.isEmpty()) {
                    char temp = stack.peek();
                    if (comparePriority(a, temp)) {
                        break;
                    } else {
                        output.append(stack.pop());
                    }
                }
                stack.push(a);
            }
        }
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    /**
     * 比较两个操作符的优先级，如果a比b优先级高输出为true,反之false
     *
     * @param a 操作符a
     * @param b 操作符b
     * @return
     */
    private static boolean comparePriority(char a, char b) {
        int ap = priority(a);
        int bp = priority(b);
        return ap > bp;
    }


    /**
     * 返回一个操作数的优先级
     *
     * @param a 　操作数
     * @return +,-优先级为0;*,/优先级为1;其他为-1
     */
    private static int priority(char a) {
        switch (a) {
            case '-':
            case '+':
                return 0;
            case '*':
            case '/':
                return 1;
            default:
                return -1;
        }
    }

    /**
     * 计算后缀表达式
     * 1.如果是操作数，将操作数直接呀入栈顶．
     * 2.如果是操作符，将栈顶的元素弹出2个，按操作进行运算,后弹出的元素作为被减数，被除数等．
     *
     * @param postfixExpression 　后缀表达式
     * @return 计算结果
     */
    private static int calculate(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : postfixExpression.toCharArray()) {
            if (isNumber(c)) {
                stack.push(char2number(c));
            } else if (operations.contains(c)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int temp = 0;
                if (c == '-') {
                    temp = num1 - num2;
                } else if (c == '+') {
                    temp = num1 + num2;
                } else if (c == '*') {
                    temp = num1 * num2;
                } else if (c == '/') {
                    temp = num1 / num2;
                }
                stack.push(temp);
            }
        }
        return stack.pop();
    }

    /**
     * 判断一个char是否是数字
     *
     * @param c
     * @return 如果是数字返回true, 反之false
     */
    private static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * 将一个char转为int数字
     *
     * @param c
     * @return 转换之后的int类型的数字
     */
    private static int char2number(char c) {
        return c - 48;
    }


    /**
     * 判断一个字符串中(){}[]是否正常闭合
     * 1.如果遇到({[则直接压入栈中
     * 2.遇到}])将栈顶元素弹出如果是对应的{[(并且最后栈为空则表示是正常匹配,否则非正常匹配
     *
     * @param expression 字符串
     * @return 正常闭合返回true, 否则返回false
     */
    private static boolean judgeExpression(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                char temp = stack.pop();
                if (temp != '(') {
                    return false;
                }
            } else if (c == '}') {
                char temp = stack.pop();
                if (temp != '{') {
                    return false;
                }
            } else if (c == ']') {
                char temp = stack.pop();
                if (temp != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
