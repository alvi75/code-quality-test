import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    /**Add an event as the last event in the buffer.**/
    public void add(LoggingEvent event){
        if (event == null) {
            throw new IllegalArgumentException("Cannot add a null event");
        }
        synchronized (this) {
            if (events.size() >= maxEvents) {
                events.remove(0);
            }
            events.add(event);
        }
    }
}