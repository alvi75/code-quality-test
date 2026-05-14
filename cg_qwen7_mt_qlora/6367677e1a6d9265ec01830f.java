import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**Format the buffered string with the pattern converter, and return the result.*/
public String format(LoggingEvent event){
        if (event == null) {
            throw new IllegalArgumentException("event cannot be null");
        }
        try {
            return this.patternConverter.format(event);
        } catch (Exception e) {
            // If there is a problem formatting the message, we don't want to break everything.
            // Just put out a warning and return the original message as the formatted message.
            LogLog.warn("Problem while formatting logging event.", e);
            return event.getMessage();
        }
    }
}