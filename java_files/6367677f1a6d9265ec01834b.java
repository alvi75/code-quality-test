import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    /**Place a  LoggingEvent in the buffer buf.*/
public void put(LoggingEvent o){
        if (o == null) {
            throw new NullPointerException("LoggingEvent cannot be null");
        }
        synchronized (this) {
            if (count >= buf.length) {
                //System.out.println("Buffer full, discarding event: " + o);
                return;
            }
            buf[count++] = o;
            if (count > maxCount) {
                maxCount = count;
            }
        }
    }
}