package Leetcode.Arrays;

import java.util.List;

public class Problem832 {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(a));        
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++) {
            int start = 0;
            int end = image.length-1;
            while(start <= end) {
                swap(image[i][start], image[i][end]);
                start++;
                end--;
            }
        }
        return image;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = (b==0) ? 1 : 0;
        b = (temp==0) ? 1: 0;
    }
}
