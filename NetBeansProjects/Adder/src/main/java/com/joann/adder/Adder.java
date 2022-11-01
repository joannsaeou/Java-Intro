/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joann.adder;

/* check the imports here because they will be inserted here */
import java.util.Scanner;

/**
 *
 * @author joann
 */
public class Adder {
    public static void main(String[] args) {
        //declare variable
          int sum = 0;
          int operand1 = 0;
          int operand2 = 0;
          
      // declare and initialize a Scanner object - the Scanner reads
    // input from the console
    
        //to fix error -  hit shift ctrl i
        Scanner sc = new Scanner(System.in);
        
        
        
    
     // declare and initialize String (text) variables to hold the
    // values that the user types in - the Console only accepts
    // text, it knows nothing about numbers
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        System.out.println("Please enter the first number to be added:");
        
        //use scanner to read it
        stringOperand1 = sc.nextLine();
        
        System.out.println("Please enter the second number to be added:");
        stringOperand2 = sc.nextLine();
        
        // to read in from the user
        //add any number and dont need to change
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        //assign sum
        
        sum = operand1 + operand2;
        
      //print out to screen
      
      System.out.println("Sum is: " + sum);
    }
    
}
