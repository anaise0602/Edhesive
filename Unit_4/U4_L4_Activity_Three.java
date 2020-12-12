package Edhesive.Unit_4;

/* Lesson 4 Coding Activity Question 3 */

import java.util.Scanner;

public class U4_L4_Activity_Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Strings:");

        String wrd1 = s.nextLine();
        String wrd2 = s.nextLine();
        String conc = "";

        if (wrd1.length() == wrd2.length()) {
            for (int i = 0; i < wrd1.length(); i++) {
                conc += wrd1.substring(i, i + 1);
                for (int j = 0; j < wrd2.length(); j++) {
                    conc += wrd2.substring(i, i + 1);
                    break;
                }
            }
            System.out.println(conc);
        } else {
            System.out.println("error");
        }
    }
}