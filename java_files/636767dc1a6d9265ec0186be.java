import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        //if it's a day step, just return the value.
        if(dayStep==1)
            return timeBucket;
        
        //otherwise, find the first day of the week for this time bucket.
        int dayOfWeek = (int)(timeBucket/dayStep)%7;
        
        //compress the time bucket by subtracting the number of days from the first day of the week.
        return timeBucket - (dayOfWeek*dayStep);
    }
}