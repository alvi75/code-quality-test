import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
		if(messages.containsKey(message)){
			long diff = System.currentTimeMillis() - messages.get(message).getTimestamp();
			if(diff > 10){
				messages.put(message,new Message(timestamp,message));
				return true;
			}
		}
		return false;
	}
}