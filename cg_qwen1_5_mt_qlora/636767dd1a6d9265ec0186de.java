import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    public boolean isExpired(long timestamp,long expiredThreshold){
        long now = System.currentTimeMillis();
        long diff = (now - timestamp);
        return (diff > expiredThreshold);
    }
}