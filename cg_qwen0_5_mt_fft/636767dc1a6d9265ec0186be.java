import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
		long newTimeBucket = (timeBucket/dayStep)*dayStep;
		if(newTimeBucket < timeBucket)
			newTimeBucket = timeBucket;
		return newTimeBucket;
	}
}