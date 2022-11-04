/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joann.windowmaster;

import java.util.Scanner;

/**
 *
 * @author joann
 */
public class WindowMaster {
    public static void main(String[] args) {
        //declare variables for height and width
    float height;
    float width;
    
    
    
    //declare String variables to hold the user's height and width input
    String stringHeight;
    String stringWidth;
    
    
    //declare other variables
    float areaOfWindow;
    float perimeterOfWindow;
    float cost;
    
    //declare and initialize the Scanner object
    Scanner myTest = new Scanner(System.in);
    
    //get input from the user
    System.out.println("please enter window height: ");
    stringHeight = myTest.nextLine();
    System.out.println("Please enter window width: ");
    stringWidth = myTest.nextLine();
    
    //convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
    
    
    //calculate the area of the window
    areaOfWindow = height * width;
    
    
    //calculate the perimeter of the window
    perimeterOfWindow = 2 * (height + width);
    
    //calculate the total cost - use a hard-coded value
    //for material cost
    cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow) );
    
    
    //display the results to the user
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost = " + cost);
     
    
    
    }
}


/*
The formula for twim is twice the height plus twice the width.

long formula:
perimeterOfWindow = height * 2 + width * 2;

shorter version:
perimeterOfWindow = 2 * (height + width);
*/