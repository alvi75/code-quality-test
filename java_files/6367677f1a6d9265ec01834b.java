import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    /** Place a  LoggingEvent in the buffer buf.
 * @param o The event to be placed into the buffer.
 */
public void put(LoggingEvent o) {
        if (o == null)
            return;
        synchronized (buf) {
            buf.add(o);
        }
    }
}