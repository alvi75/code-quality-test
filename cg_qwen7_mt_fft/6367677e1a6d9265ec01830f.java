import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event) {
		StringBuilder buf = new StringBuilder(200);
		buf.append("[").append(event.getTimeStamp()).append("] ");
		
		if (event instanceof ScheduledFileRollingAppender.ScheduledFileRollingLoggingEvent){
			ScheduledFileRollingAppender.ScheduledFileRollingLoggingEvent scheduledEvent =
				(ScheduledFileRollingAppender.ScheduledFileRollingLoggingEvent)event;
			
			buf.append(scheduledEvent.getScheduleName());
			buf.append(" - [").append(scheduledEvent.getFile().getAbsolutePath()).append("]");
		} else {
			buf.append(getFormattedThreadName(event)).append(" ");
			buf.append(event.getLoggerName()).append(": ");
		}
		
		String msgStr = event.getMessage().toString();
		int firstNLPos = msgStr.indexOf('\n');
		if(firstNLPos==-1)
			buf.append(msgStr);
		else{
			buf.append(msgStr.substring(0,firstNLPos));
			while(true){
				firstNLPos+=msgStr.indexOf('\n',firstNLPos+1)+1;
				if(firstNLPos==-1)
					break;
				buf.append(formatLineBreak(firstNLPos,msgStr.length()));
			}
		}
		
		return buf.toString();
	}
}