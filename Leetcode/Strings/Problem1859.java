package Leetcode.Strings;

import java.util.Arrays;

public class Problem1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        StringBuilder ans = new StringBuilder();
        for(String word: words) {
            int index = Integer.parseInt(word.substring(word.length() - 1)) - 1;
            sortedWords[index] = word.substring(0, word.length() - 1);
        }
        for(String word: sortedWords) {
            ans.append(word + " ");
        }
        return new String(ans).trim();
    }
}
