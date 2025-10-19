import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
		if (event.getMessage() == null) {
			return 0;
		}
		
		String msg = event.getMessage();
		if (msg != null && !msg.isEmpty()) {
			return match(msg, event.getLevel().toString());
		} else {
			return 0;
		}
	}
}