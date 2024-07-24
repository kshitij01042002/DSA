// Counting the occurence of a digit in the number

package Practise;

import java.util.*;

public class Occr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int a = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int r = (int) (n % 10);
            if (r == a) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
