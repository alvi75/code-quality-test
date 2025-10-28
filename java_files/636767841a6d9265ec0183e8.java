import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    /**
     * Add an event as the last event in the buffer.
     */
    public void add(LoggingEvent event) {
        if (event == null)
            return;
        synchronized (lock) {
            if (buffer.size() >= maxEvents) {
                // If we have reached the maximum number of events, then remove the oldest one
                buffer.removeFirst();
            }
            buffer.addLast(event);
        }
    }
}