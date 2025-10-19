import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event) {
        if (event instanceof MarkerAwareLoggingEvent) {
            return ((MarkerAwareLoggingEvent) event).getMarker().toString();
        } else {
            return super.format(event);
        }
    }
}