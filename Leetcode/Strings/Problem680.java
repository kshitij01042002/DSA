package Leetcode.Strings;

public class Problem680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
    }
    static public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean skipped = false;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end) && skipped) 
                return false;
            
            if (s.charAt(start) != s.charAt(end) && !skipped) {
                skipped = true;
                if (s.charAt(start) == s.charAt(end - 1))
                    end--;
                else if (s.charAt(start + 1) == s.charAt(end))
                    start++;
                continue;
            }
            
            start++;
            end--;
        }
        return true;
    }
}
