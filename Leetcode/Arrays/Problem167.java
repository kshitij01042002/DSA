package Leetcode.Arrays;

import java.util.Arrays;

public class Problem167  {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Problem167().twoSum(new int[]{2,7,11,15}, 9)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (numbers[start] <= numbers[end]) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            }
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
