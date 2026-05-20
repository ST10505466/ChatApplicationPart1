

import com.mycompany.chatapplicationpart1.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class the_message_test {
    //Junit testing,used to test the message methods
    
    @Test
    public void testRecipientNumberSuccess() {
        //Testing if the receivers number is valid
        
        Message msg = new Message(
                1,
                "+27839641687",
                "Hey Bestie"
        );
        
        assertEquals(
                "Cell phone number successfully captured." ,
                msg.checkRecipientCell()
                
        );
        
    }
    @Test
    //Testing inavlis recipient number
    public void testRecipientNumberFail(){
        
        Message msg = new Message(
                1,
                "0845",
                "Hey Bestie"
        );
        
        assertEquals(
                "Cell phone number is incorrectly formatted or it does not contain an international code.",
               msg.checkRecipientCell()
                );
    }
    
    @Test
    //Testing to see if the message length is valid
    public void testMessageLengthSuccess() {
        Message msg = new Message(
                1,
                "+278395641687",
                "This message is valid."
        );
        
        assertEquals(
                "Message ready to send." ,
                msg.checkMessageLength()
        );
        //Test the message options
        

    
    }
    
}
