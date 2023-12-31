package problems;

import java.util.Stack;

public class ValidParentheses {
    public static boolean runValidParenthesesSolution(String parentheses){
        //We create a stack here to push any closing tag. We do this for the comparison case.
        Stack<Character> validateParentheses = new Stack();

        //Convert String to char []
        char [] parenthesesArray = parentheses.toCharArray();

        //Loop through character array
        for(char x : parenthesesArray){
            /**
             * Comparison cases:
             * Regardless of what open parentheses is read in, we will push a closing tag accordingly.
             * The reason we do this is that when we run into a closing tag in the String that is passed
             * we end up popping the latest pushed character. This should always match since we would have just
             * pushed the closing tag in.
             *
             * If they do not match, that means that closing tag is incorrect.
             */
            if(x == '{'){
                validateParentheses.push('}');
            } else if(x == '('){
                validateParentheses.push(')');
            } else if(x == '['){
                validateParentheses.push(']');
            } else if (validateParentheses.isEmpty() || x != validateParentheses.pop()){
                return false;
            }
        }

        return validateParentheses.isEmpty();
    }
}
