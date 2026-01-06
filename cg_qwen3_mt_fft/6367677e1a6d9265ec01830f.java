import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event) {
        StringBuffer buf = new StringBuffer();
        // Format the message using the pattern converter.
        for (int i=0; i<converters.length; i++) {
            converters[i].format(event, buf);
        }
        return buf.toString();
    }
}