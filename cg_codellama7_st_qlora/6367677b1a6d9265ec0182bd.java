import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event){
        StringBuffer buf = new StringBuffer();
        buf.append(event.getLevel().toString());
        buf.append(" ");
        buf.append(event.getThreadName());
        buf.append(" ");
        buf.append(event.getLoggerName());
        buf.append(" ");
        buf.append(event.getTimeStamp());
        buf.append(" ");
        buf.append(event.getNDC());
        buf.append(" ");
        buf.append(event.getRenderedMessage());
        buf.append(" ");
        buf.append(event.getThrowableStrRep());
        return buf.toString();
    }
}