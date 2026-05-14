import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event){
        final StringBuilder buf = new StringBuilder(1024);
        buf.append(event.getLevel().toString());
        buf.append(" ");
        buf.append(event.getLoggerName());
        buf.append(":");
        buf.append(event.getMessage());
        if (event.getThrowableInformation() != null) {
            buf.append("\n");
            buf.append(event.getThrowableInformation().getThrowableStrRep()[0]);
        }
        return buf.toString();
    }
}