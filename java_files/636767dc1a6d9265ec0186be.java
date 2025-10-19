import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
		long compressedTimeBucket = 0;
		if(timeBucket > 0){
			compressedTimeBucket = (timeBucket - 1) / dayStep + 1;
		}
		return compressedTimeBucket;
	}
}