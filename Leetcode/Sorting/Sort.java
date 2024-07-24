package Leetcode.Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        insertion(a);
        System.out.println(Arrays.toString(a));
    }

    static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }

    static void insertion (int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    private static int getMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void bubble (int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
