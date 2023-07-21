package arrayshashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) set.add(num);
        int ans = 1;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = count > ans ? count : ans;
            }
        }
        return ans;
    }
}
