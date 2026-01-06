import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(messages.containsKey(timestamp)){
            long now = System.currentTimeMillis();
            long diff = now - messages.get(timestamp);
            if(diff > 10){
                messages.put(timestamp,message);
                return true;
            }
        }
        return false;
    }
}