import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
public String format(final LoggingEvent event){
        final StringBuilder buf = new StringBuilder();
        buf.append(event.getLevel().getName()).append(": ");
        buf.append(event.getMessage());
        if (event.getThrowableProxy() != null) {
            buf.append(" [").append(event.getThrowableProxy().toString()).append("]");
        }
        return buf.toString();
    }
}