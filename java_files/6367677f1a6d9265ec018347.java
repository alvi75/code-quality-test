import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        for (Connection conn : connections) {
            try {
                conn.write(message);
            } catch (IOException e) {
                logger.error("Error sending message to connection", e);
            }
        }
    }
}