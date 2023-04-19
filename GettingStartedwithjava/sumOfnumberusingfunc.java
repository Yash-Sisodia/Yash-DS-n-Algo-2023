package GettingStartedwithjava;

import java.util.*;
public class sumOfnumberusingfunc {

    public static int calculateSum(int a, int b) {
        //int sum = a + b;
        return a+b ;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();

        int sumfi = calculateSum(num1,num2);
        System.out.println(sumfi);



    }
}
