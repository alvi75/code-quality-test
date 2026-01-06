import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event) {
		String s = event.getMessage().toString();
		if (s.indexOf(matchString) != -1)
			return ACCEPT;
		else
			return DENY;
	}
}