import java.util.*;

public class Generated_6367672d1a6d9265ec017c73 {
    @Override
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!messages.containsKey(message)) {
            messages.put(message, timestamp);
            return true;
        } else {
            Integer lastTimestamp = messages.get(message);
            if (timestamp - lastTimestamp >= 10) {
                messages.put(message, timestamp);
                return true;
            }
        }
        return false;
    }
}