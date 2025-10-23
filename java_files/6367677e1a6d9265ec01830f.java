import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**
 * Format the buffered string with the pattern converter, and return the result.
 */
public String format(LoggingEvent event) {
        if (event == null) {
            throw new NullPointerException("LoggingEvent must not be null");
        }
        if (buffer.length() > 0) {
            buffer.setLength(0);
        }

        // Append the date
        if (datePatternConverter != null) {
            datePatternConverter.format(event, buffer);
        }

        // Append the level
        if (levelPatternConverter != null) {
            levelPatternConverter.format(event, buffer);
        }

        // Append the logger name
        if (loggerNamePatternConverter != null) {
            loggerNamePatternConverter.format(event, buffer);
        }

        // Append the message
        if (messagePatternConverter != null) {
            messagePatternConverter.format(event, buffer);
        }

        // Append the throwable
        if (throwablePatternConverter != null) {
            throwablePatternConverter.format(event, buffer);
        }

        return buffer.toString();
    }
}