package Edhesive.Unit_2;

/* Lesson 8 Coding Activity Question 3 */

import java.util.Scanner;
import java.lang.Math;

public class U2_L8_Activity_Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int one = scan.nextInt();
        int two = scan.nextInt();
        System.out.println("Difference: " + Math.abs(one - two));
    }
}