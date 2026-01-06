import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
        if (event == null) {
            throw new NullPointerException("LoggingEvent cannot be null");
        }
        synchronized (this.lock) {
            if (events.size() > 0) {
                events.get(events.size() - 1).setNext(event);
            } else {
                events.add(event);
            }
        }
    }
}