/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joann.truefalse;

/**
 *
 * @author joann
 * Subject: Boolean Values
 */
public class truefalse {
    public static void main(String[] args) {
        
//Boolean Expression
int x = 200;
int y = 700;

System.out.println(x < y);  //true
System.out.println(y > x); //true
System.out.println(x <= y); //true
System.out.println(y <= x); //false


//using if else statement 

if( x > y) {
System.out.println("Right");
} else if (x < y) {
System.out.println("Wrong");

} else{
System.out.println("Unknown statement");
}


if( 200 >= 200) {
System.out.println("They are equal");
} else if(200 <= 200) {
System.out.println("They are not Equal");

}
 
        
       
    }
    
}
