package GettingStartedwithjava;

/*
Question : Digit Frequency

1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Input Format
A number n
A digit d

Output Format
A number representing frequency of digit d in number n

Constraints
0 <= n <= 10^9
0 <= d <= 9

Sample Input
994543234
 4

 Sample Output
3
 */



import java.util.*;
public class digitFrequency {

    public static int getDigitFrequency(int n, int c) {
        int counter=0;
        while(n!=0) {
            int rem = n%10;  //last digit
            if(rem==c) {
                counter++;
                n=n/10;
            }
            else {
                n=n/10;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //21344
        int c = sc.nextInt(); //4

        int ficounter = getDigitFrequency(n, c);
        System.out.println(ficounter);
    }
    }
   
