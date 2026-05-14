import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
		if (event == null) {
			return NEUTRAL;
		}
		
		String msg = event.getMessage().toString();
		if (msg != null && msg.contains(matchString)) {
			return matchAction;
		} else {
			return noMatchAction;
		}
	}
}