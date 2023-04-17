package GettingStartedwithjava;


import java.util.*;
public class usingfuncaddition {

    public static int sumOfNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();

        int sum = sumOfNumbers(e,f);
        System.out.println(sum);
    }
}


