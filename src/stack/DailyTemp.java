package stack;

import java.util.*;

// Given an array of integers temperatures represents the daily temperatures, 
// return an array answer such that answer[i] is the number of days you have to wait 
// after the ith day to get a warmer temperature. If there is no future day for which this is possible, 
// keep answer[i] == 0 instead.

public class DailyTemp {
    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> stack = new Stack<>();   
        for (int today = 0; today < temps.length; today++) {
            while (!stack.empty() && temps[stack.peek()] < temps[today]) {
                int prev = stack.pop();
                res[prev] = today - prev;
            }
            stack.add(today);
        }
        return res;
    }
}
