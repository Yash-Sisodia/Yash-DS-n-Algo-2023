package GettingStartedwithjava;
// Decimal to any base program 

import java.util.*;
public class decimaltoanybase {
    public static int lastDigit(int n , int b) {
        int p = 0;
        int pow = 0;
        while(n!=0) {
            int rem = n%b;
            p += (rem) * (int) Math.pow(10,pow);
            pow++;
            n=n/b;
        }
        System.out.println(p);
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input number
        int b = sc.nextInt(); // jis base m jaana h wo wala number
        int fi = lastDigit(n, b);
    }
}
