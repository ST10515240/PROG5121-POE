/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationuser;

import static com.mycompany.registrationuser.LoginClass.authenticate;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class Registrationuser {

    static String username;
    static String password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Registration -----");
        
        System.out.print("Enter Name: ");
        String firstname = input.nextLine();
        
         System.out.print("Enter Last Name: ");
        String lastname = input.nextLine();


       

       
        boolean validUsername = false;

        while (!validUsername) {
          System.out.print("Enter Username: ");
          username = input.nextLine();

    if (LoginClass.isValidUsername(username)) {
        System.out.println("Username successfully captured.");
        validUsername = true;
       
        
       
        
    } else {
        
         System.out.println("Username is not correctly formatted.");
        System.out.println("Please ensure that the username contains an underscore and is no more than five characters in length.");
        
       
        
        
        }
        }

       boolean validPassword = false;

       while (!validPassword) {
        System.out.print("Enter Password: ");
        password = input.nextLine();

    if (LoginClass.checkPasswordComplexity(password)) {
        System.out.println("Password is not correctly formatted.");
        System.out.println("Ensure it has at least 8 characters, a capital letter, a number, and a special character.");
    } else {
        System.out.println("Password successfully captured.");
        validPassword = true;

        }
        }

      boolean validPhone = false;

      while (!validPhone) {
       System.out.print("Enter Cellphone: ");
        String cellphone = input.nextLine();

    if (LoginClass.checkCellPhoneNumber(cellphone)) {
        System.out.println("Cellphone number is incorrect.");
        System.out.println("Format must be +27 followed by 9 digits.");
    } else {
        System.out.println("Cellphone number successfully added.");
        validPhone = true;
            }
        }
        System.out.println("\nRegistration successful.");

        System.out.println("\n----- Login -----");
        
        boolean loginSuccess = false;

        while (!loginSuccess) {
            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter Login Password: ");
            String loginPass = input.nextLine();

            if (authenticate(loginUser, loginPass)) {
                System.out.println("Login successful. Welcome " + firstname + " " + lastname);
                loginSuccess = true;
            } else {
                System.out.println("Login unsuccessful. Incorrect username or password.\n");
            }
        }

        input.close();
    }

    
  
    }


        

        
        
        
     


        
            
        

        
    
        

    

    

            
  
                
               
    
   

 
        
                
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
