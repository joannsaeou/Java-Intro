
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joann
 */
public class Test {
    public static void main(String[] args) {
    Scanner mainObj = new Scanner(System.in);
    
 
    String userName;
    String passWord;
    
    //enter username and password and press enter
    System.out.println("Please enter your username");
    userName = mainObj.nextLine();
    
    System.out.println("Please enter your password");
    passWord = mainObj.nextLine();
    
    System.out.println("Please enter your name");
       //String input
       String name = mainObj.nextLine();
       
       
    System.out.println("Please enter your age");
    
    
    
    //numerical input
        int age = mainObj.nextInt();
        
        
        
        System.out.println("Please enter your salary");
        double salary = mainObj.nextDouble();

    
    
    System.out.println("Username is: " + userName);
    System.out.println("Password is: " + passWord);
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    
    System.out.println("Salary is: " + salary);
    }
    
}
