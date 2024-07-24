// Reverse an integer.
package Practise;

import java.util.Scanner;

public class Rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            r = r * 10 + rem;
        }

        System.out.println(r);
    }
}
