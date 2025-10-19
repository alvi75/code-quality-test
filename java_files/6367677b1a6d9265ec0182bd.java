import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    public String format(final LoggingEvent event){
		StringBuilder sb = new StringBuilder();
		sb.append(event.getLevel().toString());
		sb.append(" ");
		sb.append(event.getLoggerName());
		sb.append(":");
		sb.append(event.getMessage());
		return sb.toString();
	}
}