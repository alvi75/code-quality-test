import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    /**
     * Return true if the timestamp minus the lastUpdateTimestamp is greater than expiredThreshold,otherwise return false.
     */
    public boolean isExpired(long timestamp,long expiredThreshold){
        long diff = timestamp - lastUpdateTimestamp;
        return (diff > expiredThreshold);
    }
}