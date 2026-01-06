import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    /**Send a message to each of the connections in telnet-friendly output.**/
    public synchronized void send(final String message) {
        for (final TelnetConnection connection : connections.values()) {
            try {
                connection.getOutputStream().write(message.getBytes());
            } catch (IOException e) {
                log.error("Error writing to connection: " + connection, e);
            }
        }
    }
}