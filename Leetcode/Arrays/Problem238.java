package Leetcode.Arrays;

import java.util.Arrays;

public class Problem238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
    static int[] productExceptSelf(int[] nums) {
        int product = 1;
        for(int a: nums){
            product *= a;
        }
        if (product == 0) {
            for(int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int temp = 1;
                    for(int j = 0; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            temp *= nums[j];
                        }
                    }
                    nums[i] = temp;
                }
            }
            for(int j = 0; j < nums.length; j++){
                if (nums[j] != 0) {
                    nums[j] = 0;
                }
            }
            return nums;
        }
        for(int j = 0; j < nums.length; j++) {
            nums[j] = product / nums[j];
        }
        return nums;
    }
}
