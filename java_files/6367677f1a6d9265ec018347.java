import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message) {
        for (final Connection c : connections) {
            try {
                c.send(message);
            } catch (final IOException e) {
                LOGGER.warn("Error sending message to connection " + c, e);
            }
        }
    }
}