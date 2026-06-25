
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MessageManagerTest {
    
    @Test
    public void testAddMessageAndDisplayReport() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String report = manager.displayReport();
        assertTrue(report.contains("Message Hash: 001"));
        assertTrue(report.contains("Recipient: +27718693002"));
        assertTrue(report.contains("Message: Hello Mike"));
    }

    @Test
    public void testGetLongestMessage() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Short msg");
        manager.addMessage("002", "+27718693003", "This is a much longer message than the first one");

        String longest = manager.getLongestMessage();
        assertEquals("This is a much longer message than the first one", longest);
    }

    @Test
    public void testSearchByRecipientFound() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Dinner tonight?");
        manager.addMessage("002", "+27718693003", "Payment received?");

        String result = manager.searchByRecipient("+27718693002");
        assertTrue(result.contains("Dinner tonight?"));
    }

    @Test
    public void testSearchByRecipientNotFound() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String result = manager.searchByRecipient("+27711111111");
        assertEquals("No messages found for recipient: +27711111111", result);
    }

    @Test
    public void testDeleteMessageFound() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String response = manager.deleteMessage("001");
        assertTrue(response.contains("Message deleted"));
    }

    @Test
    public void testDeleteMessageNotFound() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String response = manager.deleteMessage("999");
        assertEquals("Message hash not found.", response);
    }

    @Test
    public void testMarkMessageRead() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String response = manager.markMessageRead("001");
        assertEquals("Message 001 marked as READ.", response);
    }

    @Test
    public void testMarkMessageReadNotFound() {
        MessageManager manager = new MessageManager();
        manager.addMessage("001", "+27718693002", "Hello Mike");

        String response = manager.markMessageRead("999");
        assertEquals("Message hash not found.", response);
    }


    private void assertTrue(boolean contains) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}



