package arrayshashing;
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

import java.util.Arrays;

class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        return Arrays.equals(arrs, arrt);
    }
}