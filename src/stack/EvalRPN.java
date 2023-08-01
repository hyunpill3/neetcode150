package stack;

import java.util.Stack;

// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) stack.add(stack.pop() + stack.pop());
            else if (s.equals("-")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.add(r - l);
            } else if (s.equals("*")) stack.add(stack.pop() * stack.pop());
            else if (s.equals("/")) {
                int l = stack.pop();
                int r = stack.pop();
                stack.add(r / l);
            } else stack.add(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
