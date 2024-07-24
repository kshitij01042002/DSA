package Leetcode.Arrays;

import java.util.Arrays;

public class Problem867 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = transpose(a);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
