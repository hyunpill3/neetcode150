package arrayshashing;

// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

import java.util.ArrayList;
import java.util.List;

class Duplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 1 || nums.length > 100000)
            return false;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < -1 * Math.pow(10, 9) || nums[i] >  Math.pow(10, 9))
                return false;
            if (list.contains(nums[i])) {
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
}
