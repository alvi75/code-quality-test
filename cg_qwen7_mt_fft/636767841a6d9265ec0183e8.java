import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event) {
        if (event instanceof ScheduledFileRollingEvent) {
            super.add(event);
        } else {
            long n = ((NewFileRollingEventListener)super.getSuperClass()).getNextFileSwitchTime();
            LoggingEvent new_event=new ScheduledFileRollingEvent(event, this, n);
            super.add(new_event);
        }
    }
}