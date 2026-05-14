import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
    public String format(final LoggingEvent event) {
        final StringBuilder buf = new StringBuilder();
        buf.append(event.getLevel().toString());
        buf.append(" - ");
        buf.append(event.getLoggerName());
        buf.append(" - ");
        buf.append(event.getMessage());
        return buf.toString();
    }
}