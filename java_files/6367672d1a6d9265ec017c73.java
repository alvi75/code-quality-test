import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    /**
 * If the message does not exist in the dict messages, or it exists but the timestamp (seconds) difference is bigger than 10, put the message and timestamp into messages and return true, otherwise return false.
 */
    if(!messages.containsKey(message)){
        messages.put(message,timestamp);
        return true;
    }else{
        int diff = timestamp - messages.get(message);
        if(diff > 10){
            messages.put(message,timestamp);
            return true;
        }
    }

    return false;
}
}