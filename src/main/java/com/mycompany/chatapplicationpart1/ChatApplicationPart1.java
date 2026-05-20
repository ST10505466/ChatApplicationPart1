

package com.mycompany.chatapplicationpart1;

import java.util.Scanner;
//THE MAIN CLASS THAT RUNS THE ENTIRE APPLICATION
public class ChatApplicationPart1 {

    public static void main(String[] args) {
        //I AM CREATING A OBJECT OF THE LOGIN CLASS SO THAT I CAN USE IT'S METHOD
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        
        //THE REGISTRATION PART
        System.out.println("WELCOME BESTIE");
        System.out.println("Let's Register!");
        
        System.out.print("ENTER YOUR NAME:    ");
        String firstName = input.nextLine();
        //WHERE THE USER IS PROMPTED TO ADD THEIR FIRST NAME
        
        System.out.print("ENTER YOUR SURNAME:  ");
        String lastName = input.nextLine();
        //HERE THE USER NEEDS TO ENTER THEIR LAST NAME
        
        System.out.print("ENTER USERNAME:   ");
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
        System.out.println(" == LOGIN ==");
        
        System.out.print("ENTER USERNAME:  ");
        String loginUser = input.nextLine();
        //USER ENTERS USERNNAME THAT WAS ENTERED WHEN DOING THE REGISTRATION SECTION
        
        System.out.print("ENTER PASSWORD:  ");
        String loginPass;
        //USER ENTERS THE SAME PASSWORD THAT WAS CREATED AT THE REGISTRATION SECTION
        loginPass = input.nextLine();
        
        boolean success;
        success = login.loginUser(loginUser, loginPass);
        //CHECK IF LOGIN DETAILS ARE CORRECT
        System.out.println(login.returnLoginStatus(success));
        //LOGIN STATUS MESSAGE IS DISPLAYED

        //Welcome messga edisplayed after successful login
        if(success) {
            System.out.println("Welcome to QuickChat.");
             
            
            //Variable used for the menu selection
            int option = 0;
            
            //The loop will continue running until the user chooses option 3
            while(option != 3) {
                
                //QuickChat menu
                System.out.println("""
                                   1) Send Messages
                                   2) Show recently send messages
                                   3)Quit
                                   """) ;
                System.out.println("Choose option: ");
                
                option = Integer.parseInt(input.nextLine());
                
                //The switch statements handles the menu options
                switch(option) {
                    
                    //Option 1 will allow the user to send messages
                    case 1 -> {
                        
                        //The number of messages that the user wants to send will be entered
                        System.out.print("How many messages do you want to send ?");
                        
                        int numMessages = Integer.parseInt(input.nextLine());
                        
                        for(int i = 0; i< numMessages; i++) {
                            //The loop repeats but that depends on the number of messages entered
                            
                            //User enters the message text
                            System.out.print("Enter your message: ");
                            
                            String text = input.nextLine();
                            String recipient = null;
                            
                            //Creating message object
                            Message msg = new Message (i, recipient, text);
                            
                            System.out.println(msg.checkRecipientCell());
                            //Check if receivers number format is correct
                            
                            System.out.println(msg.checkMessageLength());
                            //Checking if the message length is valid
                            
                            System.out.println("""
                                               1)Send Message
                                               2)Disregard Message
                                               3)Store Messgae
                                               """);
                            //The message option menu
                            
                            int choice = Integer.parseInt(input.nextLine());
                            
                            System.out.println(msg.sentMessage(choice));
                            //Showing the result of option selected
                            
                            System.out.println(msg.printMessages());
                            //Showing the full message details
                            
                        }
                        //Showing the total number of messages sent
                        System.out.println("Total messages sent: " + Message.totalMessages);
                    }
                    case 2 -> {
                        //Option isn't implemented yet
                        
                        System.out.println("Coming soon...");
                    }
                    case 3 -> {
                        System.out.println("Exiting QuickChat...");
                        //The third option allows users to exit the application
                        
                    }
                    
                    default -> {
                        
                        System.out.println("Invalid option");
                        
                            
                            
                                    
                                            
                                                    
                      }
                    }
                }
        
            }
       
        
    }
}
