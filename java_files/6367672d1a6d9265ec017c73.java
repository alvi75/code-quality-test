import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    public boolean shouldPrintMessage(int timestamp,String message){
        if(messages.containsKey(timestamp)){
            long diff = System.currentTimeMillis() - messages.get(timestamp).timestamp;
            if(diff > 10000)
                messages.put(timestamp,new Message(timestamp,message));
            else
                return false;
        }
        else{
            messages.put(timestamp,new Message(timestamp,message));
        }
        return true;
    }
}