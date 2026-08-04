import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o) {
        if (o == null) {
            return;
        }
        if (buf.size() >= maxSize) {
            buf.remove(0);
        }
        buf.add(o);
    }
}