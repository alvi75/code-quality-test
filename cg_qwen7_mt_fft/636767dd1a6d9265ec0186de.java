import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    public boolean isExpired(long timestamp,long expiredThreshold){
        long diff = Math.abs(timestamp-lastUpdateTimestamp);
        return (diff >= expiredThreshold)?true:false;
    }
}