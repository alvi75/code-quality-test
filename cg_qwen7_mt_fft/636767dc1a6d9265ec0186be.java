import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        // find the first day of the year in the same hour
        int offsetToFirstInYear = (int)(timeBucket - getStartOfDayInMs((int)timeBucket));
        return getStartOfHour(getStartOfYearFromMillis(timeBucket)) + offsetToFirstInYear;
    }
}