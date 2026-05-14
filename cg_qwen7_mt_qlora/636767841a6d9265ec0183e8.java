import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    /**Add an event as the last event in the buffer.*/
public void add(LoggingEvent event){
        if (event == null) {
            throw new IllegalArgumentException("LoggingEvent cannot be null");
        }
        synchronized (buffer) {
            if (buffer.size() >= maxBufferSize) {
                buffer.remove(0);
            }
            buffer.add(event);
        }
    }
}