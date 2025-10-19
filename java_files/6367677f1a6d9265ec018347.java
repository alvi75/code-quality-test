import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    /**Send a message to each of the connections in telnet-friendly output.
 * @param message The message to be sent.
 */
public synchronized void send(final String message) {
        for (Connection connection : this.connections.values()) {
            if (!connection.isClosed()) {
                try {
                    connection.send(message);
                } catch (IOException e) {
                    // Ignore, we'll just close the connection.
                }
            }
        }
    }
}