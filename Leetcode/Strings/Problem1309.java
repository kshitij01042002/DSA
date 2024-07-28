package Leetcode.Strings;

public class Problem1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
        // System.out.println((char)('1' + 97));
    }

    public static String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                if (s.charAt(i) == '1') {
                    ans.append((char)('j' + (int)s.charAt(i + 1) - '0'));
                }
                if (s.charAt(i) == '2') {
                    ans.append((char)('t' + (int)s.charAt(i + 1) - '0'));
                }
                i += 2;
            }
            else
                ans.append((char)('a' + (int)s.charAt(i) - '0' - 1));
            i++;
        }
        return ans.toString();
    }
}
