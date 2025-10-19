import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
		if(event instanceof LogMessageEvent)
			return ((LogMessageEvent)event).getMessage().matches(pattern) ? 1 : 0;
		else if(event instanceof LogExceptionEvent)
			return ((LogExceptionEvent)event).getException().getMessage().matches(pattern) ? 1 : 0;
		else return 0;
	}
}