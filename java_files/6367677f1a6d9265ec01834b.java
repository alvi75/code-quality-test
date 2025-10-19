import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o) {
        if (o instanceof FoundationLoggingEvent) {
            ((FoundationLoggingEvent) o).setFoundationLogger(foundationLogger);
        }
        super.put(o);
    }
}