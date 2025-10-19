import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        for (final OutboundConnection connection : this.connections) {
            try {
                connection.write(message);
            } catch (final IOException e) {
                logger.error("Error while sending message: {}", e.getMessage());
            }
        }
    }
}