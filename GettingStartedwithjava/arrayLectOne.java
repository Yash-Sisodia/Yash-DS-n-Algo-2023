package GettingStartedwithjava;

/* Arrays Basics Begin */

import java.util.*;
public class arrayLectOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];
        marks[0] = 51;
        marks[1] = 31;
        marks[2] = 44;
        marks[3] = 67;
        marks[4] = 98;

        System.out.println("Single Input : "+marks[3]);

        // Now I have to print all the input marks

        for(int i = 0; i <= marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    
}
