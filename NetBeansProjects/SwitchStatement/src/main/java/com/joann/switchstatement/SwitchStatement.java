/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joann.switchstatement;

import java.util.Scanner;

/**
 *
 * @author joann
 */
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);

        System.out.println("Please choose a number from 1 to 5: ");
        

        
    int day = userChoice.nextInt();
    switch(day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    
    
    
    }
    
    
    }
}
