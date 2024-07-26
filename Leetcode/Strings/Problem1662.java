package Leetcode.Strings;

public class Problem1662 {
    public static void main(String[] args) {
        String[] str1 = {"ab", "c"};
        String[] str2 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(str1, str2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String word: word1) {
            str1.append(word);
        }

        for(String word: word2) {
            str2.append(word);
        }

        System.out.println(str1);
        System.out.println(str2);

        return str1.toString().equals(str2.toString());
    }
}
