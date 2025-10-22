import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
        if (event == null) {
            return;
        }
        synchronized (buffer) {
            if (buffer.size() < maxBufferLength) {
                buffer.add(event);
            } else {
                buffer.remove(0);
                buffer.add(event);
            }
        }
    }
}