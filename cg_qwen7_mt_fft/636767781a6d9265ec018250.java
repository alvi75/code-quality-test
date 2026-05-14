import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event) {
		if (event instanceof ScheduledFileRollingAppenderEvent) {
			ScheduledFileRollingAppenderEvent scheduledEvent = 
				(ScheduledFileRollingAppenderEvent)event;
			return scheduledEvent.getDecision();
		}
		else{
			return FileRollingEventListener.super.decide(event);
		}
	}
}