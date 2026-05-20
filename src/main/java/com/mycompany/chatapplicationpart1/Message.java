
package com.mycompany.chatapplicationpart1;

import java.util.Random;

//This class is going to be responsible for the creation and management of messages


public class Message {
    
    //Variable that is used to store the unique message ID
    private final String messageID;
    
    //This one stores the current message number
    private final int messageNumber;
    
    //Stores the receivers cell phone number
    private final String recipient;
    
    //Stores the actucal message that is typed out by the user
    private final String messageText;
    
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
    //This method creates a message has
    //This hash will include: Message number,first and last word of the message and the first two digits of message ID
    public String createMessageHash() {
        
        String[] words = messageText.split("");
        //Splitting the message into separate words
        
        String firstWord = words[0];
        //Getting the first word
        
        String lastWord = words[words.length - 1];
         
        
        String hash = messageID.substring(0,2) + ":" + messageNumber + ":" + firstWord + lastWord;
        //Building the hash
         
        return hash.toUpperCase();
        //Converting them to uppercase 
    }
    //This method deals with message options selected ny the user
    //The options are:
    //Send message, disgard message and store message
    public String sentMessage(int choice) {
        
        switch (choice) {
            case 1 -> {
                //If the user decides to send a message
                totalMessages++;
                return "MESSAGE SUCCESSFULLY SENT" ;
            }
            case 2 -> {
                return "PRESS 0 TO DELETE THE MESSAGE" ;
            }
            case 3 -> {
                return "MESSAGE SUCCESSFULLY STORED" ;
            }
            default -> {
                return "INVALID OPTION" ;
            }
        }
    }
    //This method shows all the message details
    public String printMessages() {
        
        return "MESSAGE ID: " + messageID 
                + "/nMessgae Hash:" + createMessageHash()
                +"nRecipient :" + recipient +
                "/nMessagae:" + messageText;
        
        
    }
    //Returining the total amount of message sent
    public int returnTotalMessages() {
        
        return totalMessages;
        
    }
    
    

    
    
    
}
