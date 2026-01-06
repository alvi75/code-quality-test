import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    /**
 * /**Follow the dayStep to reformat the time bucket with TIME_BUCKET_FORMATTER. For example, if dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123.*/
    static long compressTimeBucket(long timeBucket,int dayStep){
        int day = (int) ((timeBucket - DAY_START_TIME_BUCKET) / DAY_STEP);
        return (day + 1) * DAY_STEP + DAY_START_TIME_BUCKET;
    }
}