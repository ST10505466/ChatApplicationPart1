import com.mycompany.chatapplicationpart1.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test_login {
    //The junit testing will be done in this method
    Login login = new Login();
    //The methods of the login class will be tested, creating object
    
    //Fisrtly the Username tests
    @Test
    public void testUsernameCorrect() {
        //Testing using the correct format and meeting the requirements
        assertTrue(login.checkUserName("kyl_1"));
        //THE USERNAME HAD A UNDERSCORE AND IS 5 CHARACTERS LONG
    }
    @Test
    public void testUsernameIncorrect() {
        assertFalse(login.checkUserName("kyle!!!!!!!"));
        //The username does not meet the requirements
    }
    //PASSWORD TESTING
    @Test
    public void testPasswordCorrect() {
        //Test if the password is valid
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
        //Password is valid seeing that it contains a capital letter,a number,a special character, and is 8 characters long
    }
    @Test
    public void testPasswordIncorrect() {
       assertFalse(login.checkPasswordComplexity("password"));
       //Password is invalid because it does not meet the requirements mentioned above
    }
    //CELL PHONE NUMBER TESTING
   
    @Test
    public void testCellNumberCorrect() {
        //Testing to see if a correct cell number will work
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
        //Valid cell number as it contains the country code
    }
    @Test
    public void testCellNumberIncorrect() {
       assertFalse(login.checkCellPhoneNumber("08966553"));
       //Cell phone number does not contain the country code
        
    }
    //LOGIN TESTING
    @Test
    public void tesLoginSuccess() {
        //User registers first
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");
         boolean result = login.loginUser("kyl_1", "Ch&&sec@ke99!");
         //Enter the details that user registered with
         
         assertTrue(result);
         //The result expected should be correct
         
    }
    @Test
    public void testLoginFail() {
        login.registerUser("kyl_1", "Ch&&secke99!", "+27838968976", "Kyle", "Smith");
        //Register a user first
        
        boolean result = login.loginUser("wrong", "wrong");
        //Enter incorrect details
        
        assertFalse(result);
        //The result expected should be 
    }
}
