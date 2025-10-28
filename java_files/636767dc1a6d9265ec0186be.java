import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        int day = (int)timeBucket;
        int month = day/100;
        int year = day - month*100;
        int dayOfMonth = day%100;
        int dayOfWeek = dayOfMonth + dayStep;
        while(dayOfWeek > 7){
            dayOfWeek -= 7;
        }
        return ((year-1980)*100+month)*100+dayOfWeek;
    }
}