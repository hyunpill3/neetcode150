package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.


public class GenParentheses {
    Stack<Character> stack = new Stack<>();
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generateParenthesis(0, 0, n);
        return res;
    }

    private void generateParenthesis(int open, int close, int n) {
        if (open < n) {
            stack.push('(');
            generateParenthesis(open + 1, close, n);
            stack.pop();
        }
        if (close < open) {
            stack.push(')');
            generateParenthesis(open, close + 1, n);
            stack.pop();
        }
        if (open == close && open == n) {
            Iterator itr = stack.iterator();
            String temp = "";
            while (itr.hasNext()) {
                temp = temp + itr.next();
            }
            res.add(temp);
        }
    }
}
