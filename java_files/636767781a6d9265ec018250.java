import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event) {
        if (event.getMessage() == null)
            return 0;
        String msg = event.getMessage();
        if (msg != null && msg.startsWith("ERROR: "))
            return 1;
        else if (msg != null && msg.startsWith("WARNING: "))
            return 2;
        else if (msg != null && msg.startsWith("INFO: "))
            return 3;
        else if (msg != null && msg.startsWith("DEBUG: "))
            return 4;
        else if (msg != null && msg.startsWith("TRACE: "))
            return 5;
        else if (msg != null && msg.startsWith("FATAL: "))
            return 6;
        else if (msg != null && msg.startsWith("WARN: "))
            return 7;
        else if (msg != null && msg.startsWith("ERROR: "))
            return 8;
        else if (msg != null && msg.startsWith("WARNING: "))
            return 9;
        else if (msg != null && msg.startsWith("INFO: "))
            return 10;
        else if (msg != null && msg.startsWith("DEBUG: "))
            return 11;
        else if (msg != null && msg.startsWith("TRACE: "))
            return 12;
        else if (msg != null && msg.startsWith("FATAL: "))
            return 13;
        else if (msg != null && msg.startsWith("WARN: "))
            return 14;
        else if (msg != null && msg.startsWith("ERROR: "))
            return 15;
        else if (msg != null && msg.startsWith("WARNING: "))
            return 16;
        else if (msg != null && msg.startsWith("INFO: "))
            return 17;
        else if (msg != null && msg.startsWith("DEBUG: "))
            return 18;
        else if (msg != null && msg.startsWith("TRACE: "))
            return 19;
        else if (msg != null && msg.startsWith("FATAL: "))
            return 20;
        else if (msg != null && msg.startsWith("WARN: "))
            return 21;
        else if (msg != null && msg.startsWith("ERROR: "))
            return 22;
        else if (msg != null && msg.startsWith("WARNING: "))
            return 23;
        else if (msg != null && msg.startsWith("INFO: "))
            return 24;
        else if (msg != null && msg
}