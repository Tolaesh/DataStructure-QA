package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotaion {
    //150. Evaluate Reverse Polish Notation
    //You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
    //Evaluate the expression. Return an integer that represents the value of the expression.
    //The valid operators are '+', '-', '*', and '/'.
    //Each operand may be an integer or another expression.
    //The division between two integers always truncates toward zero.
    //There will not be any division by zero.
    //The input represents a valid arithmetic expression in a reverse polish notation.
    //The answer and all the intermediate calculations can be represented in a 32-bit integer.
    //Example 1:
    //Input: tokens = ["2","1","+","3","*"]
    //Output: 9
    //Explanation: ((2 + 1) * 3) = 9

    public static int reversePolish(String[] stg){
        Stack<Integer> stack = new Stack<>();
        for(String s: stg){
            if(isOperator(s)){
                int b =stack.pop();
                int a =stack.pop();
                int result =perform(a,b,s);
                stack.push(result);
            }
            else {
                int num=Integer.parseInt(s);
                stack.push(num);
            }
        }
        return stack.pop();
    }
    private static boolean isOperator(String s) {
        return s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/");
    }

    private static int perform(int a, int b, String s) {
        return switch (s) {
            case "-" -> a - b;
            case "+" -> a + b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException(" BAD OPERATOR");
        };
    }
    public static void main(String[] args){
        String[] stg ={"2","1","+","3","*"};
        System.out.println(reversePolish(stg));
    }

    //The algorithm works by processing the tokens in a stack-based manner.
    //Numbers are pushed onto the stack.
    //When operators are encountered, you pop two numbers, apply the operation, and push the result back.
    //At the end, the stack will have one element left, which is the result of the entire expression.

}
