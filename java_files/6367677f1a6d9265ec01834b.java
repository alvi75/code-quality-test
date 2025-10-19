import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    /**
 * Place a  LoggingEvent in the buffer buf.
**/
public void put(LoggingEvent o){
        if (buf == null) {
            buf = new ArrayList();
        }
        buf.add(o);
    }
}