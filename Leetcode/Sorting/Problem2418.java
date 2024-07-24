package Leetcode.Sorting;

import java.util.Arrays;

public class Problem2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
        System.out.println(Arrays.toString(heights));
    }
    static public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length; i++) {
            // int first = i;
            int maxIndex = getMaxIndex(heights, i, names.length - 1);
            System.out.println(heights[maxIndex]);
            swapNames(names, maxIndex, i);
            swapInt(heights, maxIndex, i);
        }
        return names;
    }
    
    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swapInt(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        System.out.println(Arrays.toString(arr));
    }

    static void swapNames(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
