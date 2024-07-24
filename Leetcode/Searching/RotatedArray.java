package Leetcode.Searching;

public class RotatedArray {
    public static void main(String[] args) {
        System.out.println(findPivot(new int[]{3, 4, 5, 6, 7, 0, 1, 2}));
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid =  start + (end - start) / 2;   
            if (nums[mid] > nums[mid + 1])
                return mid;
            
            if(nums[mid - 1] > nums[mid])
                return mid - 1;

            if(nums[start] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
