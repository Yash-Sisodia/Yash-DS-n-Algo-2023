package GettingStartedwithjava;

// In this program we will check is the number is prime or not ?


import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for(int i = 2 ; i<n ; i++) {
            if(n%i==0) {
                counter++;
            }
        } if(counter==0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
