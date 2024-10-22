package Stack;

import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String s){
        Stack<Character> stack =new Stack<>();
        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++){
            char current =c[i];
            if(current == '{' || current =='[' || current =='('){
                stack.push(current);
            }
            else if(current ==']' || current =='}' || current == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((current == '}' && top != '{') ||
                        (current == ')' && top != '(') ||
                        (current == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s ="(){}[]";
        System.out.println(isBalanced(s));
    }
}
