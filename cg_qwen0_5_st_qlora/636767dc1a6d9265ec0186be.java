import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        //if dayStep is 0, return the original time bucket.
        if(dayStep == 0) {
            return timeBucket;
        }
        //if dayStep is negative, return the original time bucket.
        if(dayStep < 0) {
            return timeBucket;
        }
        //if dayStep is positive, return the original time bucket.
        if(dayStep > 0) {
            return timeBucket + (dayStep - 1) * DAY_STEP;
        }
        //if dayStep is zero, return the original time bucket.
        return timeBucket;
    }
}