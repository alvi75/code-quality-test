import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(messages.containsKey(message)){
            int lastTimestamp = messages.get(message);
            if(lastTimestamp < timestamp - 10){
                messages.put(message,timestamp);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            messages.put(message,timestamp);
            return true;
        }
    }
}