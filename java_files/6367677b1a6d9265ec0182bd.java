import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
    public String format(final LoggingEvent event) {
        if (event == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(event.getLevel().getName());
        sb.append(": ");
        sb.append(event.getMessage());
        sb.append(" [");
        sb.append(event.getLoggerName());
        sb.append("] ");
        sb.append(getTime(event));
        sb.append("\n");
        return sb.toString();
    }
}