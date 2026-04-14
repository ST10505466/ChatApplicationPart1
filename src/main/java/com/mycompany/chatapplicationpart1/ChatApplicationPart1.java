

package com.mycompany.chatapplicationpart1;

import java.util.Scanner;
//THE MAIN CLASS THAT RUNS THE ENTIRE APPLICATION
public class ChatApplicationPart1 {

    public static void main(String[] args) {
        //I AM CREATING A OBJECT OF THE LOGIN CLASS SO THAT I CAN USE IT'S METHOD
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        
        //THE REGISTRATION PART
        System.out.println("=== REGISTER ===");
        
        System.out.print("ENTER FIRST NAME:    ");
        String firstName = input.nextLine();
        //WHERE THE USER IS PROMPTED TO ADD THEIR FIRST NAME
        
        System.out.print("ENTER LAST NAME:  ");
        String lastName = input.nextLine();
        //HERE THE USER NEEDS TO ENTER THEIR LAST NAME
        
        System.out.print("ENTER USERNAMER:   ");
        String username = input.nextLine();
        //USER NEEDS TO ENTER A VALID USERNAME
        //USERNAME THAT CONTAINS AN UNDERSCORE AND IS NO MORE THAN 5 CHARACTERS LONG
        
        System.out.print("ENTER PASSWORD:  ");
        String password = input.nextLine();
        //USER NEEDS TO ENTER A PASSWORD
        //THAT IS ATLEAST 8 CHARACTERS LONG, HAS A CAPITAL LETTER,A NUMBER AND A SPECIAL CHARACTER
        
        System.out.print("ENTER SA CELL NUMBER (+27...):  ");
        String number = input.nextLine();
        //USER ENTERS A VALID SA PHONE NUMBER
        
        String message = login.registerUser(username, password, number, firstName, lastName);
        System.out.println(message);
        //Storing the returned message and calling registerUser method
        
        //THE LOGIN PART
        System.out.println("/n == LOGIN ==");
        
        System.out.print("ENTER USERNAME:  ");
        String loginUser = input.nextLine();
        //USER ENTERS USERNNAME THAT WAS ENTERED WHEN DOING THE REGISTRATION SECTION
        
        System.out.print("ENTER PASSWORD:  ");
        String loginPass = input.nextLine();
        //USER ENTERS THE SAME PASSWORD THAT WAS CREATED AT THE REGISTRATION SECTION
        
        boolean success = login.loginUser(loginUser, loginPass);
        //CHECK IF LOGIN DETAILS ARE CORRECT
        System.out.println(login.returnLoginStatus(success));
        //LOGIN STATUS MESSAGE IS DISPLAYED
        
    }
}
