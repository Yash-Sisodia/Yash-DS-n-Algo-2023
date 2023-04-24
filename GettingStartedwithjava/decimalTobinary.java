package GettingStartedwithjava;

// Decimal to Binary

import java.util.*;
public class decimalTobinary {

    public static int calculateLastDigit(int n) {
       int pow = 0;
       int p =0;
       while(n!=0) {
        int rem = n%2;
        //System.out.print(rem);
        p += (rem) * (int) Math.pow(10,pow);
        pow++;
        n=n/2;
       }
       System.out.print(p);
       return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int b = sc.nextInt();
        int fi = calculateLastDigit(n);
    }
}
