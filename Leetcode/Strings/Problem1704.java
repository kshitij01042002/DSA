package Leetcode.Strings;

public class Problem1704 {
    public static void main(String[] args) {
        boolean ans = halvesAreAlike("Uo");
        System.out.println(ans);
    }
    public static boolean halvesAreAlike(String s) {
        int leftCount = 0;
        int rightCount = 0;
        s.inde
        int mid = s.length() / 2;
        s = s.toLowerCase();
        for (int i = 0; i < mid; i++) {
            if (
                s.charAt(i) == 'a' || 
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u'
            ) {
                leftCount++;
            }

            if (
                s.charAt(i + mid) == 'a' || 
                s.charAt(i + mid) == 'e' ||
                s.charAt(i + mid) == 'i' ||
                s.charAt(i + mid) == 'o' ||
                s.charAt(i + mid) == 'u'
            ) {
                rightCount++;
            }
        }

        return leftCount == rightCount;
    }
}
