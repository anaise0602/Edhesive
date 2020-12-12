package Edhesive.Unit_2;

/* Lesson 5 Coding Activity Question 3 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the number of sides: ");
        int side = scan.nextInt();
        System.out.println("Type a side length:");
        double len = scan.nextDouble();
        RegularPolygon poly = new RegularPolygon(side, len);
        System.out.println(poly);
    }
}