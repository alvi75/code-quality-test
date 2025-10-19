import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event) {
        final StringBuilder sb = new StringBuilder();
        if (event.getLevel().isGreaterOrEqual(Level.ERROR)) {
            sb.append("[ERROR] ");
        } else if (event.getLevel().isGreaterOrEqual(Level.WARN)) {
            sb.append("[WARN] ");
        } else if (event.getLevel().isGreaterOrEqual(Level.INFO)) {
            sb.append("[INFO] ");
        } else {
            sb.append("[DEBUG] ");
        }
        sb.append(event.getMessage());
        return sb.toString();
    }
}