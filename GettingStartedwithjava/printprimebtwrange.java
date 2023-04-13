package GettingStartedwithjava;


import java.util.*;
public class printprimebtwrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low ; i<high ; i++) {
            int counter = 0;
            for(int j = 2 ; j*j<=i; j++) {
                if(i%j==0) {
                    counter++;
                }
            }
            if(counter==0) {
                System.out.println(i);
            }
        }
    }
}

