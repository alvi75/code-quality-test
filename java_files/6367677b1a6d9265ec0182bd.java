import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event){
		final StringBuffer buf = new StringBuffer();
		buf.append(event.getLevel().toString());
		buf.append(" ");
		buf.append(event.getLoggerName());
		buf.append(" - ");
		buf.append(event.getMessage().toString());
		buf.append("\n");
		return buf.toString();
	}
}