package Leetcode.Searching;

public class Problem69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(6));
    }
    public static int mySqrt(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start) / 2;
        int rem = 0;
        if (n == 0) return 0;
        if (n <= 3) return 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            rem = n / mid;l
            if (mid == rem) {
                return mid;
            }
            if (mid > rem) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return rem;
    }
}
