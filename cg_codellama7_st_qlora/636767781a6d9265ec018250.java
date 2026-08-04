import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
		String msg = event.getRenderedMessage();
		if(msg.contains(match)){
			return 1;
		}
		return 0;
	}
}