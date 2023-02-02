/* For Loop tutorial */
// Print Hello World 10 times by using for loop 

import java.util.*;
public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++) {
            System.out.println("Hello World : "+i);
        }
    }
}
