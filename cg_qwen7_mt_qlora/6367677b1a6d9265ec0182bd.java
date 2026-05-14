import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
    public String format(final LoggingEvent event){
        final StringBuffer buf = new StringBuffer();
        buf.append(event.getTimeStamp());
        buf.append(" ");
        buf.append(event.getLevel().toString());
        buf.append(" [");
        buf.append(Thread.currentThread().getName());
        buf.append("] ");
        buf.append(event.getLoggerName());
        buf.append(": ");
        buf.append(event.getMessage());
        if (event.getThrowableInformation() != null) {
            buf.append("\n");
            buf.append(event.getThrowableInformation().getThrowableStrRep());
        }
        return buf.toString();
    }
}