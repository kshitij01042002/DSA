package Leetcode.Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(50));
    }

    static int fibonacciNumber (int n) {
        if (n < 2) {
            System.out.println(n);
            return n;
        } 
        System.out.println(fibonacciNumber(n - 1) + fibonacciNumber(n - 2));
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}
