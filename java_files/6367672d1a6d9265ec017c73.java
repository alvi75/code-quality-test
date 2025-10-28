import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
		if(!messages.containsKey(message)){
			messages.put(message,new TimestampedMessage(timestamp,message));
			return true;
		}
		else if((System.currentTimeMillis()-messages.get(message).timestamp)>10){
			messages.put(message,new TimestampedMessage(timestamp,message));
			return true;
		}
		return false;
	}
}