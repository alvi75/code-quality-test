import java.util.*;

public class Generated_6367677f1a6d9265ec018347 {
    public synchronized void send(final String message){
		if (message == null || message.length() == 0) return;
		
		for (Connection connection : connections){
			connection.send(message);
		}
	}
}