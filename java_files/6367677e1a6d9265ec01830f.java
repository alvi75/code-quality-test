import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event){
		if (formatter == null) {
			return "";
		}
		String message = formatter.format(event);
		return message;
	}
}