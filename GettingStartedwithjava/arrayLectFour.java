package GettingStartedwithjava;

// How to take input from user in java (Default Initialisation)

import java.util.*;
public class arrayLectFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
