import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
		if(!messages.containsKey(message)){
			messages.put(message,new Integer(timestamp));
			return true;
		}
		else if((timestamp-messages.get(message)).intValue()>10){
			messages.put(message,new Integer(timestamp));
			return true;
		}
		return false;
	}
}