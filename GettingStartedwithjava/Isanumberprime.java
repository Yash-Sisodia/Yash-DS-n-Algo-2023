package GettingStartedwithjava;

/*Is A Number Prime
Easy  Prev   Next
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Input Format
A number t
A number n
A number n
.. t number of times
Output Format
prime
not prime
not prime
.. t number of times 


Constraints
1 <= t <= 10000
2 <= n < 10^9
Sample Input
5
13
2
3
4
5
Sample Output
prime
prime
prime
not prime
prime





*/





import java.util.*;
public class Isanumberprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //number of times "t"

        for(int i = 1; i<=t ; i++) {
            int n = sc.nextInt();
            int counter = 0;
            for(int j = 2; j<n; j++) {
                if(n%j==0) {
                    counter++;
                }
            }
            if(counter==0) {
                System.out.println("Prime");
            }
             else {
                System.out.println(" Not Prime");
            }
        }
    }
}
