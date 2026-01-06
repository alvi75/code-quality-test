import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        if (this.connected) {
            for (final Connection connection : this.connections) {
                try {
                    connection.write(message);
                } catch (final IOException e) {
                    LOGGER.error("Error writing to socket: {}", e.getMessage());
                }
            }
        }
    }
}