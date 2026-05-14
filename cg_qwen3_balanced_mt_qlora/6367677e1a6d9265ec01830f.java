import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**Format the buffered string with the pattern converter, and return the result.**/
    public String format(LoggingEvent event) {
        if (event == null) {
            return "";
        }
        StringBuffer buf = new StringBuffer();
        try {
            format(event, buf);
        } catch (IOException e) {
            // ignore
        }
        return buf.toString();
    }
}