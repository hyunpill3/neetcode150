package twopointers;

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int l = 0, r = height.length - 1;
        int lval = height[l], rval = height[r];
        int res = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                lval = Math.max(height[l], lval);
                res += lval - height[l];
            } else {
                r--;
                rval = Math.max(height[r], rval);
                res += rval - height[r];
            }
        }
        return res;
    }
}
