import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o){
        if (o == null) {
            return;
        }
        synchronized (buf) {
            //if (buf.size() > MAX_SIZE)
            //    throw new IllegalStateException("Buffer is full");
            buf.add(o);
        }
    }
}