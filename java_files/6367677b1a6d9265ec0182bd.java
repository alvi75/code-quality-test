import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**
 * Formats LoggingEvent as a fixed-format string
 */
public String format(final LoggingEvent event) {
        final StringBuilder sbuf = new StringBuilder(1024);
        format(event, sbuf);
        return sbuf.toString();
    }
}