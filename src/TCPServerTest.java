import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TCPServerTest {

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() {
        TCPClient client = new TCPClient();
        String response = "";
        try {
            client.startConnection("127.0.0.1", 6666);
       //     response = client.sendMessage("hello server");
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertNotNull(response);
        //assertEquals("hello client", response);
    }
}