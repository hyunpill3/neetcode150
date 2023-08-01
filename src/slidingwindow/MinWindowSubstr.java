package slidingwindow;

import java.util.*;

// Given two strings s and t of lengths m and n respectively, return the minimum window substring
//  of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.

// public class MinWindowSubstr {
//     public String minWindow(String s, String t) {
//         if (t.length() > s.length() || s.equals("") || t.equals("")) return "";
//         Map<Character, Integer> map = new HashMap<>();
//         for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
//         int start = 0;
//         return "";
//     }
// }
