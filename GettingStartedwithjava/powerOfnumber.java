package GettingStartedwithjava;


import java.util.*;
public class powerOfnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int p1 = sc.nextInt();
        int ans1 = 1;

        for(int i = 1 ; i <= p1 ; i++) {
            ans1 = ans1*n1;
        }
        System.out.println(ans1);

        // Now again you've to calculate power of a number

        int n2 = sc.nextInt();
        int p2 = sc.nextInt();
        int ans2 = 1;

        for(int i = 1 ; i <= p2 ; i++) {
            ans2 = ans2*n2;
        }
        System.out.println(ans2);


    }
}
