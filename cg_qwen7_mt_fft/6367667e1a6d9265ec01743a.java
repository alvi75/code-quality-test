import java.util.*;

public class Generated_6367667e1a6d9265ec01743a {
    public long lastWriteTimeStampInMilliseconds() {
        if (lastWriteTimestamp == -1) {
            return -1;
        } else {
            // convert nano-seconds to milli-seconds.
            return TimeUnit.NANOSECONDS.toMillis(lastWriteTimestamp);
        }
    }
}