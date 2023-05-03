package GettingStartedwithjava;

import java.util.*;
public class span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        // input array 
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // code
        int max = arr[0];
        int min = arr[0];

        // here i am assuming the largest number will be on the first place 
        // and minu=imum number on the first place as well 

        for(int j=0; j<arr.length-1; j++) {
            if(max < arr[j+1]) {
                max = arr[j+1];
            }

            if(min > arr[j+1]) {
                min = arr[j+1];
            }
        }

        // System.out.println("Maximum number is : "+max);
        // System.out.println("Minimum number is : "+min);

        // Span of an array 
        int span = max-min;
        System.out.println(span);
    }
}
