import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    public boolean isExpired(long timestamp,long expiredThreshold){
        long diff = System.currentTimeMillis() - timestamp;
        if(diff > expiredThreshold){
            return true;
        }
        return false;
    }
}