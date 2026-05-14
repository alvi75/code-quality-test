import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        if (this.connections == null) {
            return;
        }
        for (final Connection connection : this.connections.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                //ignore, we'll just remove it from our list.
            }
        }
    }
}