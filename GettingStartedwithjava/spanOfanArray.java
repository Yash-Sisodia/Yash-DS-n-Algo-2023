package GettingStartedwithjava;

import java.util.*;
public class spanOfanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        // input array
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Max = arr[0];
        int Min = arr[0];
        for(int j=0; j<arr.length-1; j++) {
            if(Min<arr[j+1]) {
               Min = arr[j+1];
            }
            if(Max>arr[j+1]) {
                Max = arr[j+1];
            }
        }

        System.out.println(Max);
        System.out.println(Min);

        int span = (Max) - (Min);
        System.out.println(span);
    }
    
}
