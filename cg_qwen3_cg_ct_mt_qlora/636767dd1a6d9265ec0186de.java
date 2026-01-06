import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    public boolean isExpired(long timestamp,long expiredThreshold){
        long lastUpdateTimestamp = this.lastUpdateTimestamp;
        if(lastUpdateTimestamp == 0) {
            return false;
        }
        return (timestamp - lastUpdateTimestamp) > expiredThreshold;
    }
}