package GettingStartedwithjava;

// Is a number prime optimization code 

// import java.util.*;
// public class isanumprimeoptimization {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt(); // number of times your loop is going to run

//         for(int i = 1 ; i <=t ; i++) {
//             int n = sc.nextInt();
//             int counter = 0;

//             for(int j = 2 ; j*j<=n ; j++) {
//                 if(n%j==0) {
//                     counter++;
//                 }
//             }
//             if(counter==0) {
//                 System.out.println("prime");
//             } 
//             else {
//                 System.out.println("not prime");
//             }
//         }
//     }
// }

// Is a number prime question extra optimization 

import java.util.*;
public class isanumprimeoptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1 ; i<=t ; i++) {
            int n = sc.nextInt();
            int counter = 0;

            for(int j = 2 ; j*j<=n ; j++) {
                if(n%j==0) {
                    counter++;
                    break;
                }
            }
            if(counter==0) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            } 
        }
    }
}
