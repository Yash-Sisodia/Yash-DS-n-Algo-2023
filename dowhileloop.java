/* Do While Loop Working
Print number from 1 to 9 by using do while loop 
 */

import java.util.*;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //9
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i<=n);
    }
}
