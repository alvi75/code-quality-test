import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(!messages.containsKey(message)){
            messages.put(message,timestamp);
            return true;
        }
        else{
            long tstamp = messages.get(message);
            if((tstamp-timestamp)/10 > 10){
                messages.put(message,timestamp);
                return true;
            }
            else{
                return false;
            }
        }
    }
}