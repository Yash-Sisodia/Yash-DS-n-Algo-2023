/* While Loop Working
Print counting 1 to 9 by using while loop
 */

import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //9

        int i = 1;
        while(i<=n) {
            System.out.println(i);
            i++;
        }
        System.out.println("Done!!");
    }
}
