package binarysearch;

public class MedianTwoSortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int mid = (m + n + 1) / 2;
        int l = 0, r = m;
        double res = 0.0;
        while (l <= r) {
            int i = 
        }
    }
}
