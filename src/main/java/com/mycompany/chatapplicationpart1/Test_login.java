
package com.mycompany.chatapplicationpart1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions*;


public class Test_login {
    //Unit tests to verify that the methods used are executed the way they suppose to be
    Login login = new Login();
    //A obejct is created to tests the method
    
    
    //USERNAME TESTS
    
    
    public void testUsernameCorrect() {
        //Test to ensure that the username conatins an underscore and has more than 5 characters
        assertTrue(login.checkUserName("kyl_1"));
        //Correct username
        
    }
    
    public void testUserNameIncorrect() {
        assertFalse(login.checkUserName("kyle!!!!!!!"));
        //This username does not have all the validations
        
    }
    //PASSWORD TEST
    //Test if the password meets all the requirements
    public void testPasswordCorrect() {
        assertTrue(login.checkPasswordComplexity("ch&&sec@ke99!"));
        //When password meets all the requirements(Has a capital letter, number, special character and is longer than 8 character
        
    }
    public void testPasswordIncorrect() {
        assertFalse(login.checkPasswordComplexity("password"));
        //Password does not meet all requirements
    }
    //CELL PHONE NUMBER TEST
    //Testing to ensure that the SA phone number is correct
    public void testCellNumberCorrect() {
        assertTrue(login.checkCellPhoneNumber("+2783896897"));
        //Cell phone number is the correct format and is the correct lenth
        
    }
    public void testCellNumberIncorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
        //Cell phone number is invalid, doesn't have the country code
    }
    //LOGIN TESTS
    //Testing to ensure that the login process is successful and meets all the requirements
    public void testLoginSuccess() {
        login.registerUser("kyl_1","ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
        //User enters registration details
        
        boolean result = login.loginUser("kyl_1", "ch&&secke99!");
        //Entering correct details
        assertTrue(result);
        //Expected results should be that details entered are correct
        
    }
    public void testLoginFail
            //The results with login details that are incorrect
            login.registerUser("kyl_1", "ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
            //User should first register
}
    boolean result = login.loginUser("wrong", "wrong");
            //Enter incorrect details

            assertFalse(result);
    }

}


            
            


