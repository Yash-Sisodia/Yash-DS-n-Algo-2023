package GettingStartedwithjava;

import java.util.*;
public class helloArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];

        // input aray 
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //output array 
        for(int j = 0; j<arr.length; j++) {
            System.out.println("Here is your input array : "+ arr[j]);
        }
    }
}
