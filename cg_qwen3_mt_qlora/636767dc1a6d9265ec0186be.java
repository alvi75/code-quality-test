import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    /**Follow the dayStep to reformat the time bucket with TIME_BUCKET_FORMATTER. For example, if dayStep == 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123.*/
    static long compressTimeBucket(long timeBucket,int dayStep){
        int year = (int) ((timeBucket / 10000L) % 10000);
        int month = (int) ((timeBucket / 100L) % 100);
        int day = (int) (timeBucket % 100);

        //if dayStep is 11, 20000105 re-formatted time bucket is 20000101, 20000115 re-formatted time bucket is 20000112, 20000123 re-formatted time bucket is 20000123.
        if(dayStep > 0 && dayStep < 100){
            int dayOffset = day % dayStep;
            if(dayOffset != 0){
                day -= dayOffset;
            }
        }

        return year * 10000L + month * 100L + day;
    }
}