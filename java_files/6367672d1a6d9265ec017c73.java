import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
		if(!messages.containsKey(message)){
			messages.put(message,message);
			return true;
		}else{
			String[] parts = message.split("\\.");
			int ts = Integer.parseInt(parts[parts.length-1]);
			if(timestamp-ts>10)
				return true;
			else
				return false;
		}
	}
}