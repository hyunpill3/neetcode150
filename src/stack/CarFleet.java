package stack;

import java.util.*;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 1) return 1;
        Stack<Float> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (int i = keys.size() - 1; i >= 0; i--) {
            float time = (float)(target - keys.get(i)) / map.get(keys.get(i));
            if (!stack.empty() && time <= stack.peek()) continue;
            else stack.push(time);            
        }
        return stack.size();
    }
}
