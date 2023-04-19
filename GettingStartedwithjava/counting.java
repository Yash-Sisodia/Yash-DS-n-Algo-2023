package GettingStartedwithjava;

/* Print counting of a number using function */

import java.util.*;
public class counting {
    // public static int printCount(int n) {
    //     for(int i = 1 ; i<=n ; i++) {
    //         System.out.println(i);
    //     }
    //     return 1; // ye function kuch bhi return nhi krega sirf counting print krega toh hum void ka use krenge 
    // }

    public static void printCount(int n) {
        for(int i = 1 ; i<=n ; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printCount(n);
    }
}
