package Leetcode.Searching;

public class Problem81 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,1,2,2,0,0}, 0));
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            // just do normal binary search
            return BS(nums, target, 0 , nums.length - 1);
        }

        if(nums[pivot] == target)
            return true;

        if (target >= nums[0]) {
            return BS(nums, target, 0, pivot - 1);
        }

        return BS(nums, target, pivot + 1, nums.length - 1);
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid =  start + (end - start) / 2;
            if (end > mid && nums[mid] > nums[mid + 1])
                return mid;
            
            if(start < mid && nums[mid - 1] > nums[mid])
                return mid - 1;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // If start or end-1 was pivot
                if(start < end && nums[start] > nums[start + 1]){
                    return start;
                }
                start++;

                if(end > start && nums[end] < nums[end - 1]) {
                    return (end - 1);
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean BS(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return true;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
