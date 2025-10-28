import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event) {
        if (event == null)
            throw new NullPointerException("LoggingEvent is null");
        if (patternConverter == null)
            throw new NullPointerException("PatternConverter is null");

        return patternConverter.format(event);
    }
}