import java.util.*;

public class Generated_636767841a6d9265ec0183e8 {
    public void add(LoggingEvent event){
		if(event == null) return;
		synchronized (buffer) {
			buffer.addLast(event);
		}
	}
}