package Practise;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum of two digits is " + sum(num1, num2));
    }`

    static int sum(int a, int b) {
        return a + b;
    }
}
