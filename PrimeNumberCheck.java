/* Prime Number Checker 

7-> 1,7 (Prime)
9-> 1,9,3 (Not Prime)
17-> 1,17 (Prime)
 */

import java.util.*;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;

        for(int i = 2 ; i<n ; i++) {
            if(n%i==0) {
                counter++;
            }
        }
        if(counter!=0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}
