package Practise;

public class FindPeak {
    public static void main(String[] args) {
        int[] a = {5 ,1, 3};
        System.out.println(findPeakElement(a));
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
