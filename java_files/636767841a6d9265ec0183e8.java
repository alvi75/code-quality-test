import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    /**Add an event as the last event in the buffer.**/
    public void add(LoggingEvent event){
        if (event == null) {
            throw new NullPointerException("event");
        }
        synchronized (this) {
            if (buffer.size() >= MAX_BUFFER_SIZE) {
                return;
            }
            buffer.add(event);
        }
    }
}