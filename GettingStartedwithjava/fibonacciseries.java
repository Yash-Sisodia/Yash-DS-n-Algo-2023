package GettingStartedwithjava;

import java.util.*;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of terms
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        for(int i = 2 ; i <n ; i++) {
            int sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
    }
}
