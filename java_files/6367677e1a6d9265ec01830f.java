import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event)
    {
        if (event == null) throw new NullPointerException("event");
        if (patternConverter == null) throw new NullPointerException("patternConverter");

        StringBuffer buffer = new StringBuffer();
        buffer.append(patternConverter.format(event));
        return buffer.toString();
    }
}