import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket, int dayStep) {
        long timeBucketCompressed = timeBucket;
        if (dayStep > 1) {
            timeBucketCompressed = timeBucket / dayStep * dayStep;
        }
        return timeBucketCompressed;
    }
}