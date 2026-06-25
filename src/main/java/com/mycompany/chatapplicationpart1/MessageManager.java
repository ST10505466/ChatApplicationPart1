
package com.mycompany.chatapplicationpart1;
//IN THIS CLASS MESSAGES WILL BE MANAGED IN THE APPLICATION
//IT STORES THE MESSAGE DETAILS AND ITT WILL BE USED TO DELETE,SEARCH AND DISPLAY MESSAGES



public class MessageManager {
    //ARRAYS USED TO STORE MESSAGE INFORMATION
    private final String[] messageHashes = new String[100];
    private final String[] recipients = new String[100];
    private final String[] messages = new String[100];
    
    //TO KEEP TRACK OF THE AMOUNT OF MESSAGES THAT HAVE BEEN STORED
    private int messageCount = 0;
    private String[] readFlags;
    
   public void addMessages(String hash, String recipient, String message) {
       //THIS METHOD STORES A NEW MESSGAE INSIDE THE ARRAYS
       
       //SAVE THE MESSAGE DETAILS
       messageHashes[messageCount] = hash;
       recipients[messageCount] = recipient;
       messages[messageCount] = message;
       
       messageCount++;
       //INCREASE THE COUNTER FOR THE NEXT MESSAGE
   }
   public String getLongMessage() {
       //THIS METHOD SEARCHED THROUGH ALL THE MESSAGES AND RETURNS THE LONGEST MESSAGE THAT WAS STORED
       
       String longest = "";
       //VARIABLE USED TO KEEP THE CURRENT LONGEST MESSAGE
       
       for (int i = 0; i < messageCount; i++) {
           //LOOP THROUGH EVERY STORED MESSAGE
           
           if (messages[i].length() > longest.length()) {
               //COMPARE MESSAGE LENGTHS
               
               longest = messages[i];
               //UPDATE LONGEST MESSAGE
           }
       }
       return longest;
   }
   
   public String searchByRecipient(String recipient) {
       //SEARCHES FOR ALL MESSAGES THAT BELONG TO THE RECIPIENT ENTERED BY THE USER
       
       String result = "";
       //VARIABLE USED TO STORE ALL MATCHING MESSAGES
       
       for (int i = 0; i < messageCount; i++) {
           //CHECK EVERY STORED RECIPIENT
           
           if (recipients[i].equals(recipient)) {
               
               result += messages[i] + "/n";
               //ADDING MATCHING TO MATCH THE RESULTS
               
           }
       }
       if (result.isEmpty()) {
           //IF NO MESSAGES WERE FOUND
           
           return"No messages found,";
           
       }
       
       return result;
       
   }
   public String deleteMessage(String hash) {
       //DELETES THE MESSAGES USISING MESSAGE HAS
       //ONCE THE MESSAGE HAS BEEN DELETED THE REMAINING ARRAY VALUES WILL BE SHIFTED TO MAKE SURE THAT THERE ARE NOT ANY EMPTY SPACES
       
       for (int i = 0; i < messageCount; i++) {
           //SEARCHING FOR THE MATCHING HASH
           
           if (messageHashes [i].equals(hash)) {
               //STORE DELETED MESSAGE BEFORE REMOVING IT
                              //STORE DELETED MESSAGE BEFORE REMOVING IT
               
               for (int j = i; j < messageCount - 1; j++) {
                   //SHIFT ALL REMAINING ARRAY VALUES TO THE LEFFT
                   
                   messageHashes[j] = messageHashes[j + 1];
                   recipients[j] = recipients[j + 1];
                   messages[j] = messages[j + 1];
                   
               }
               messageCount --;
               //ONE LESS MESSAGE NOW
               
             
               
               
           }
       }
       return "Message hash not found." ;
       //IF THE MESSAGE HASH WAS NOT FOUND
   }
   
   public String displayReport() {
       //DISPLAYING A REPORT THAT SHOWS ALL THE STORED MESSAGES
       
       String report = "=== MESSAGE REPORT ====/n";
       //VARIABLE THAT IS USED TO BUILD THE REPORT
       
       for (int i = 0; i < messageCount; i++) {
           //LOOP THROUGH EVERY MESSAGE THAT IS STORED
           
           report += "Message Hash:  " + messageHashes[i] + "/n";
           report += "Recipient: " + recipients[i] + "/n";
           report += "Message: " + messages[i] + "/n";
           report += "Read: " + readFlags[i] + "/n";
           report += "--------------/n";
           
           
           
           
       }
       return report;
       
   }

    public void addMessage(String string, String string0, String hello_Mike) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String hello_Mike) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String short_msg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String this_is_a_much_longer_message_than_the_fi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String hello_Mike) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String hello_Mike) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addMessage(String string, String string0, String hello_Mike) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
   }
       

    

