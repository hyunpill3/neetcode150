package twopointers;

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

// The tests are generated such that there is exactly one solution. You may not use the same element twice.

// Your solution must use only constant extra space.

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int n1 = 0, n2 = numbers.length - 1;
        while (n1 < n2) {
            int sum = numbers[n1] + numbers[n2];
            if (target == sum)
                return new int [] {n1 + 1, n2 + 1};
            else if (target < sum)
                n2 -= 1;
            else
                n1 += 1;
        }
        return new int [] {};
    }
}
