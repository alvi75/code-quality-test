import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        int year = (int) (timeBucket / DAY_IN_MS);
        int month = (int) ((timeBucket - year * DAY_IN_MS) / MONTH_IN_MS);
        int day = (int) ((timeBucket - year * DAY_IN_MS - month * MONTH_IN_MS) / DAY_IN_MS);
        return year * 10000 + month * 100 + day;
    }
}