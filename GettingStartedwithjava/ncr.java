package GettingStartedwithjava;

import java.util.*;
public class ncr {

    public static int calculateNcr(int n) {
        int fact = 1;
        for(int i = n; i>1 ; i--) {
            fact = fact*i;     
        }
        return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //6
        int r = sc.nextInt();  //5
       // int nR = n - r;        //1

        int nrst = calculateNcr(n);
        //System.out.println(nrst);
        int rrst = calculateNcr(r);
        //System.out.println(rrst);
        int nRrst = calculateNcr(n-r);
        //System.out.println(nRrst);

        // int finalResult = (nrst) / (rrst) * (nRrst);
        // System.out.println(finalResult);

        // int deno = (rrst) * (nRrst);
        // int finalResult = (nrst) / deno;
        int finalResult = nrst / (rrst * nRrst);
        System.out.println(finalResult);
        
    }
}
