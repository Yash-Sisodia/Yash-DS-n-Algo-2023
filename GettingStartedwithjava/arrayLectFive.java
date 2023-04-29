package GettingStartedwithjava;

// How to input elements in an array (Actually m by using for loop)

import java.util.*;
public class arrayLectFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
