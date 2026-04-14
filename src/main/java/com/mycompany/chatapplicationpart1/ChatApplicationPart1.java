

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
        
        
        
    }
}
