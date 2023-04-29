package GettingStartedwithjava;

// 2nd Implications hai Assignments


import java.util.*;
public class arrayLectThree {
    public static void main(String[] args) {
        int [] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;

        int[] two = one;
        two[1] = 200;

        for(int i = 0; i<=one.length; i++) {
            System.out.println(one[i]);
        }

        for(int j = 0; j<=two.length; j++) {
            System.out.println(two[j]);
        }

    }
    
}
