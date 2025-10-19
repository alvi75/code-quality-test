import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    /**
 * Add an event as the last event in the buffer.
**/
public void add(LoggingEvent event){
        if (event == null) {
            return;
        }
        synchronized (this) {
            if (buffer.size() >= maxBufferedEvents) {
                // remove the first element
                buffer.remove(0);
            }
            buffer.add(event);
        }
    }
}