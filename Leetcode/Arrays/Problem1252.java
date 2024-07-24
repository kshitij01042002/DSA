package Leetcode.Arrays;

public class Problem1252 {
    public static void main(String[] args) {
        int[][] a = {{0,1},{1,1}};
       System.out.println(oddCells(2, 3, a));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int count = 0;
        for(int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++ ) {
                ans[row][j] += 1;
            }
            for (int k = 0; k < m; k++ ) {
                ans[k][col] += 1;
            }      
        }
        for(int i = 0; i < ans.length; i++) {
            for(int j =0 ; j< ans[i].length; j++) {
                if (ans[i][j] % 2 == 0)
                    count++;
            }
        }
        return count;
    }
}
