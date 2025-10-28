import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o) {
        if (o == null)
            return;
        if (buf.size() >= maxBufSize) {
            //System.out.println("Buffer full, dropping event");
            return;
        }
        buf.add(o);
    }
}