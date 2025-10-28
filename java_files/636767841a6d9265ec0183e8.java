import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event) {
        if (event == null)
            return;
        synchronized (this) {
            if (buffer.size() < MAX_BUFFER_SIZE) {
                buffer.add(event);
            } else {
                // We have reached the maximum number of events.
                // Remove the oldest event from the buffer.
                remove(buffer.get(0));
            }
        }
    }
}