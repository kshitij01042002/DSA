package Practise;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            arr[i] =  sc.nextInt();
        }

        for (int i=0; i<5; i++) {
            System.out.print(arr[i] + " ");
        }
    
        System.out.println(Arrays.toString(arr));
    }
}
