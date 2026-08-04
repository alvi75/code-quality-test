import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
		if(event==null)
			return;
		if(event.getLevel().isGreaterOrEqual(Level.ERROR)){
			if(errorEvents==null)
				errorEvents=new ArrayList<LoggingEvent>();
			errorEvents.add(event);
		}
		else if(event.getLevel().isGreaterOrEqual(Level.WARN)){
			if(warnEvents==null)
				warnEvents=new ArrayList<LoggingEvent>();
			warnEvents.add(event);
		}
		else if(event.getLevel().isGreaterOrEqual(Level.INFO)){
			if(infoEvents==null)
				infoEvents=new ArrayList<LoggingEvent>();
			infoEvents.add(event);
		}
		else if(event.getLevel().isGreaterOrEqual(Level.DEBUG)){
			if(debugEvents==null)
				debugEvents=new ArrayList<LoggingEvent>();
			debugEvents.add(event);
		}
		else if(event.getLevel().isGreaterOrEqual(Level.TRACE)){
			if(traceEvents==null)
				traceEvents=new ArrayList<LoggingEvent>();
			traceEvents.add(event);
		}
		else{
			if(otherEvents==null)
				otherEvents=new ArrayList<LoggingEvent>();
			otherEvents.add(event);
		}
	}
}