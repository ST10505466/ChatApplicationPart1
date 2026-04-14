
package com.mycompany.chatapplicationpart1;

import java.util.regex.Pattern;

//In this class the registration and login funtionality is hhandled
public class Login {
    
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    //Variables to store the users details
    
    public boolean checkUserName(String username){
        return username.contains(" _") && username.length() <= 5;
        //METHOD USED TO CHECK THAT USERNAME IS VALID
        //THE CONDITIONS ARE:IT SHOULD CONATIN A UNDERSCORE (_) AND CANNOT BE LONGER THAN 5 CHARACTERS
        
    }
    public boolean checkPasswordComplexity(String password) {
        String regex = "^(?=. [A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        return Pattern.matches(regex, password);
        //USING REGULAR EXPRESSIONS(REGEX) THIS METHOD CHECKS THE PASSWORD CREATED IS VALID
        //THE PASSSWORD CONDITIONS ARE:MUST HAVR A CAPTIAL LETTER,A SPECIAL CHARACTER, IS ATLEAST 8 CHARACTERS LONG AND HAS A NUMBER
    
    }
    
    public boolean checkCellPhoneNumber(String number){
        String regex = "^//+27//d{9}$";
        return Pattern.matches(regex, number);
        //In this method the validity of the south african cell number is checked and that the format is correct
        //The phone number should start with "+27" and should have 9 digits after
        
    }
    
    public String registerUser(String username, String password, String number, String firstName, String lastName){
        //In this method the registraion of the user is handled 
        //Will also show the messages that will pop up on the appliaction when the correct or incorrect details are entered depending on the conditions
        
        if(!checkUserName(username)){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length";
            //The message that will pop up is the username does not comply to the conditions
            
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight character, a capital letter, a number, and a special character.";
            //Message will refelct when user does not enter a password with the above mentioned conditions
            
        }
        if (!checkCellPhoneNumber(number)) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
            //Message that will pop up when incorrect south african cell number is entered
            
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        //If user passes validations their details are stored 
        
        return "Registration successful";
        //Message that will be displayed if the users details pass the validations
    }
    //The login check
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
        //The username and password entered are compared to the stored values
        
    }
    
    //The login message
    public String returnLoginStatus(boolean loginSucess) {
        boolean loginSuccess = false;
        if (loginSuccess) {
            return "Welcome" + firstName + "," + lastName + "it is grea to see you again.";
        }else{
            return "Username or password incorrect, please try again.";
            //Message that will be displayed based of whether the user inserts correct details
        }
    }
}

    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    