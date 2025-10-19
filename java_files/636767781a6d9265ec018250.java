import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
        if (event.getMessage() == null) {
            return 0;
        }
        String msg = event.getMessage().toString();
        if (msg != null && msg.length() > 0) {
            return match(msg);
        } else {
            return 0;
        }
    }
}