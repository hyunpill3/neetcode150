package slidingwindow;

import java.util.ArrayList;

// Given a string s, find the length of the longest substring without repeating characters.

import java.util.List;


public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        List<Character> substr = new ArrayList<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (substr.contains(s.charAt(i))) {
                int j = substr.indexOf(s.charAt(i));
                substr.remove(j);
                if (j > 0) substr.subList(0, j).clear();
            }
            substr.add(s.charAt(i));
            res = Math.max(substr.size(), res);
        }
        return res;
    }
}
