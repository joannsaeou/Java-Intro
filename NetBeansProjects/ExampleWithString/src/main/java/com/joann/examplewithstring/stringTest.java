/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joann.examplewithstring;

/**
 *
 * @author joann
 */
public class stringTest {
    public static void main(String[] args) {

    
  
    
    String txt = "Love";
    String txt2 = "Hate";
    String result = txt + txt2;
    
    
    
// String Methods
    System.out.println(result.toUpperCase());
    System.out.println(result.toLowerCase());
    
    
//Finding a Character in a String

    System.out.println(result.indexOf("Love"));
    
    
    
//String Length

    
    
    System.out.println("The length of string is: " + result.length());

    /*
    String Concatenation
    */
//The + operator can be used between strings to combine them. This is called concatenation:

    String name = "Jane Doe";
    String name2 = "John Doe";
    String firstName = "Garrison";
    String lastName = "Khan";
    
    System.out.println("The String Concatenation are: " + name + " & " + name2);
    System.out.println(firstName + lastName);

//You can also use the concat() method to concatenate two strings:


 System.out.println("Another way to Concatenate strings is by  using the keyword .concat: " + name.concat(name2));
 //do a practice example yourself
 
 System.out.println("This is a practice example of using .concat method to combine two strings which is call concatenate: " + firstName.concat(" " + lastName));
 System.out.println("This is a practice example of using .concat method to combine two strings which is call concatenate: " + firstName.concat(lastName));

    
    
 
 int num = 22;
 int num2 = 44;
 
 int bothNum = num + num2;
 
 System.out.println("If you use the + with integers, this is the output: " + bothNum);
 
 String x = "22";
 String y = "44";
 String z = x + y;
 
 System.out.println(z);
 
 String withQuotes = "55";
 int withoutQuotes = 44;
 
 String theOutput = withQuotes + withoutQuotes;
 
 // behind the scene it just put the two numbers together, 
 //separately its not adding its putting them together or squishing them together
 System.out.println(theOutput); 


 
 
    }
    
}
