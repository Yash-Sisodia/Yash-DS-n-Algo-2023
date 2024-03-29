package GettingStartedwithjava;

/*
Reverse A Number

1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.

Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number in reverse

Constraints
1 <= n < 10^9
Sample Input
65784383

Sample Output
3
8
3
4
8
7
5
6

 */


import java.util.*;
public class reverseofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=0) {
            int rem = n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}
