import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message) {
        if (message == null || message.isEmpty()) return;
        for (final Connection connection : this.connections) {
            try {
                connection.write(message);
            } catch (IOException e) {
                LOGGER.error("Error sending data to client", e);
            }
        }
    }
}