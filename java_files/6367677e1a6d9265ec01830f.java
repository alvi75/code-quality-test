import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    /**Format the buffered string with the pattern converter, and return the result.*/
    public String format(LoggingEvent event) {
        if (event == null) {
            return "";
        }
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < converters.size(); i++) {
            ((PatternConverter) converters.get(i)).format(event, sbuf);
        }
        return sbuf.toString();
    }
}