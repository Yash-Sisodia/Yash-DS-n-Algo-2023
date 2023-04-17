package GettingStartedwithjava;


/* Call by value function  */

import java.util.*;
public class powerOfnoUsingFunction {

    public static int calculatePower(int e,int f) {
        int ans = 1;
        for(int i = 1; i<=f ; i++) {
            ans = ans*e;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int finalans1 = calculatePower(n, p);
        int finalans2 = calculatePower(e, f);
        int finalans3 = calculatePower(g, h);

        System.out.println(finalans1);
        System.out.println(finalans2);
        System.out.println(finalans3);
    }
}
