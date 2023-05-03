package GettingStartedwithjava;


// Take an array as input from the user. Search for a given number "X" and print the index at which it occurs

import java.util.*;
public class arrayLectSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        // Input Array 
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element that you want to search : ");
        int e = sc.nextInt();

        for(int i = 0; i<arr.length ; i++) {
            if(e==arr[i]) {
                System.out.println(i);
            }
        }
    }
}
