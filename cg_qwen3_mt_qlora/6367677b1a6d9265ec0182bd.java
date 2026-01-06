import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
public String format(final LoggingEvent event){
        final StringBuffer buf = new StringBuffer();
        if (event.getLevel().toInt() >= Level.WARNNING_INT) {
            buf.append("ERROR: ");
        }
        buf.append(event.getTimeStamp());
        buf.append(' ');
        buf.append(event.getThreadName());
        buf.append(' ');
        buf.append(event.getLoggerName());
        buf.append(' ');
        buf.append(event.getLevel().toString());
        buf.append(": ");
        buf.append(event.getMessage());
        buf.append('\n');
        return buf.toString();
    }
}