import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**
 * Format the buffered string with the pattern converter, and return the result.
 */
public String format(LoggingEvent event) {
        if (buffer == null || buffer.length() == 0) {
            return "";
        }
        try {
            return mFormatter.format(buffer.toString(), event);
        } catch (Exception e) {
            // Ignore it
        }
        return "";
    }
}