import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**Format the buffered string with the pattern converter, and return the result.**/
    public String format(LoggingEvent event){
        if (event == null) {
            throw new NullPointerException("event");
        }
        if (patternConverter == null) {
            throw new NullPointerException("patternConverter");
        }
        return patternConverter.format(event);
    }
}