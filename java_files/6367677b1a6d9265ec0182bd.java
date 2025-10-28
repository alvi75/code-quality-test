import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event) {
        final StringBuilder sb = new StringBuilder();
        sb.append(event.getLevel().getName()).append(" ");
        sb.append(getDateFormatter().format(event.getTimeStamp())).append(" ");
        sb.append(event.getLoggerName()).append(": ");
        if (event.getMessage() != null) {
            sb.append(event.getMessage());
        } else {
            sb.append("<null>");
        }
        return sb.toString();
    }
}