package Edhesive.Unit_5;

/* Lesson 3 Coding Activity Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;
import edhesive.testing.Math;

public class U5_L3_Activity_Two{

  public static void randomize(RegularPolygon p){ 
    
    int sides = (( int) (Math.random() *11) +10); 
    double sideLength = ((double)(Math.random() *7) +5); 
    p.setNumSides(sides); 
    p.setSideLength(sideLength); 
  }
}

