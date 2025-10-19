import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(!messages.containsKey(message)){
            messages.put(message,new Long(timestamp));
            return true;
        }else{
            long diff = Math.abs(messages.get(message)-timestamp);
            if(diff > 10){
                messages.put(message,timestamp);
                return true;
            }
        }
        return false;
    }
}