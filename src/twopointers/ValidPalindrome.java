package twopointers;
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String letters = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (letters.length() == 0) return true;
        for (int i = 0; i <= letters.length() / 2; i++) {
            if (letters.charAt(i) != letters.charAt(letters.length() - i - 1)) return false;
        }
        return true;
    }
}

