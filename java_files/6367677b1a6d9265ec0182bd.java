import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event) {
        final StringBuilder buf = new StringBuilder(1024);
        if (event.getThreadName() != null)
            buf.append(event.getThreadName()).append(' ');
        buf.append(event.getTimeStamp());
        buf.append(" ");
        buf.append(event.getLoggerName());
        buf.append(":");
        buf.append(event.getMessage());
        if (event.getThrowableStrRep() != null)
            buf.append("\n").append(event.getThrowableStrRep());
        return buf.toString();
    }
}