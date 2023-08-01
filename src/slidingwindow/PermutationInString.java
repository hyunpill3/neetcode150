package slidingwindow;

import java.util.Arrays;

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

public class PermutationInString {
    // public boolean checkInclusion(String s1, String s2) {
    //     if (s2.length() < s1.length()) return false;

    //     for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
    //         s1 = sort(s1);
    //         if (s1.equals(sort(s2.substring(i, i + s1.length())))) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    // private String sort(String str) {
    //     char[] temp = str.toCharArray();
    //     Arrays.sort(temp);
    //     return new String(temp);
    // }

    // sliding window 

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (match(arr1, arr2)) return true;
            arr2[s2.charAt(i + s1.length()) - 'a']++;
            arr2[s2.charAt(i) - 'a']--;
        }
        return match(arr1, arr2);
    }

    public boolean match(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
