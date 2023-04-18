package GettingStartedwithjava;

import java.util.*;
public class multipleNumbersSum {
    public static int multipleAdd(int n) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i = 1 ; i<=n ; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            sum = n1+n2;
            System.out.println(sum);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of terms
        int a =  multipleAdd(n);

    }
   
}
