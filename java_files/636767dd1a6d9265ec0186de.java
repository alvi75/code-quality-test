import java.util.*;

public class Generated_636767dd1a6d9265ec0186de {
    public boolean isExpired(long timestamp,long expiredThreshold){
		if(timestamp<lastUpdateTimestamp)
			return true;
		else if(timestamp-lastUpdateTimestamp>expiredThreshold)
			return true;
		else
			return false;
	}
}