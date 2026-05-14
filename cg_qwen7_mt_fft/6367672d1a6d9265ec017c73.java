import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(!messages.containsKey(message)){
            messages.put(message,timestamp);
            return true;
        }else{
            long oldTimestamp=messages.get(message);
            if(timestamp-oldTimestamp>10){
                messages.remove(message);
                messages.put(message,timestamp);
                return true;
            }
        }

        return false;
    }
}