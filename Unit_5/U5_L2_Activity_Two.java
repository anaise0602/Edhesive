package Edhesive.Unit_5;

/* Lesson 2 Coding Activity Question 2 */
import java.lang.StringBuilder;
import java.util.Scanner;

public class U5_L2_Activity_Two {

  public static void reverser(String str) {
    StringBuilder strb = new StringBuilder();
    strb.append(str);
    strb.reverse();
    System.out.println(strb);
  }
}