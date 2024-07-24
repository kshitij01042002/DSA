package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Problem1380 {
    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rows.add(min);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            cols.add(max);
        }

        rows.retainAll(cols);

        return rows;
    }
}
