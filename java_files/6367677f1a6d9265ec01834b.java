import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o){
        if (buf == null) {
            buf = new ByteArrayOutputStream();
        }
        try {
            buf.write(o.getFormattedMessage());
        } catch (Throwable t) {
            // ignore
        }
    }
}