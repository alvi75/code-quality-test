import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
        if (message == null) {
            return;
        }
        for (Connection connection : connections) {
            try {
                connection.send(message);
            } catch (IOException e) {
                //ignore
            }
        }
    }
}