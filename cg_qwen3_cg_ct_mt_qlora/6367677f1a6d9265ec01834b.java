import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o){
        if (o == null) {
            throw new NullPointerException("LoggingEvent cannot be null");
        }
        synchronized (this) {
            if (buf.size() >= maxsize) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    // ignore
                }
            }
            buf.add(o);
            notifyAll();
        }
    }
}