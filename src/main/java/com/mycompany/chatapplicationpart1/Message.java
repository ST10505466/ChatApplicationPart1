
package com.mycompany.chatapplicationpart1;

import java.util.Random;

//This class is going to be responsible for the creation and management of messages


public class Message {
    
    //Variable that is used to store the unique message ID
    private String messageID;
    
    //This one stores the current message number
    private int messageNumber;
    
    //Stores the receivers cell phone number
    private String recipient;
    
    //Stores the actucal message that is typed out by the user
    private String messageText;
    
    //Static variable holds or keeps count of the messages being sent,all of them
    public static int totalMessages = 0;
    
    //The constructor
    //This constructor will receive the message info from the user and generate a random message ID
    
    public Message(int messageNumber, String recipient, String messageText){
     this.messageNumber = messageNumber;
     this.recipient = recipient;
     this.messageText = messageText;
     
     // random object used to generate the message ID
     Random random = new Random();
     
     //Generate random 10 digit number for the message ID
     this.messageID = String.valueOf(3021517874L + (long)(random.nextDouble() * 59456333547L));
     
     
    }
    //Check if the message ID is less than or equal to 10 characters
    //This metthod is going to ensure and check that the message ID is valid, valid being the above stated restrictions
    public boolean checkMessageID() {
        return messageID.length() <=10;
        
        
    }
    
    //This method will check that the receiver or recipients cell number follows the following conditions:
    //Starts with +27, and has 9 digits following the country code
    public String checkRecipientCell() {
        if(recipient.matches("^//+27//d{9}$")) {
            return "Cell phone number successfully captured" ;
            
        }
        else {
            return "Your cell number is not formatted correctly or does not contain an international code. Please correct the number and try again" ;
        
        }
    }
    //This method will check if the message is within the restriction which is:
    //The message may not exceed 250 characters
    public String checkMessageLength() {
        //If the message is valid
        if(messageText.length() <= 250) {
            return "Message ready to send" ;
            
        }
        else {
            int extraCharacters = messageText.length() -250;
            return "Message exceeds 250 characters by" + extraCharacters + "please reduce this size." ;
            
        }
    }

    
    
    
}
