import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**
     * Format the buffered string with the pattern converter, and return the result.
     */
    public String format(LoggingEvent event) {
        if (event == null)
            throw new NullPointerException("null argument");
        if (!initialized)
            init();
        StringBuffer buf = new StringBuffer(buffer.length());
        try {
            buffer.getChars(0, buffer.length(), buf, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This should never happen since we always have a valid buffer
            // of characters in it.
            throw new RuntimeException(e.toString());
        }
        return converter.convert(event, buf);
    }
}