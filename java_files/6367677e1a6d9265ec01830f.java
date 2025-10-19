import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event){
		if (event instanceof MarkerLoggingEvent)
			return ((MarkerLoggingEvent)event).getMarker().toString();
		
		String formatted = null;
		try{
			formatted = formatter.format(event);
		}catch(Exception e){
			logger.error("Error formatting log message",e);
		}
		return formatted;
	}
}