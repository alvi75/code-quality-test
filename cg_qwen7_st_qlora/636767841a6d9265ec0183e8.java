import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
        if (event == null) {
            throw new IllegalArgumentException("LoggingEvent cannot be null");
        }
        synchronized(this){
            if (buffer.size() >= maxBufferSize) {
                buffer.removeFirst();
            }
            buffer.add(event);
        }
    }
}