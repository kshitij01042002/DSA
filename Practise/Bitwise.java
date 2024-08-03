package Practise;

public class Bitwise {
    public static void main(String[] args) {
        int n = 12;
        // System.out.println(isOdd(n));

        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println(findUnique(arr));
    }

    public static boolean isOdd (int n) {
        return (n & 1) == 1;
    }

    public static int findUnique (int[] arr) {
        int ans = 0;

        for (int a : arr) {
            ans ^= a;
        }

        return ans;
    }
}
