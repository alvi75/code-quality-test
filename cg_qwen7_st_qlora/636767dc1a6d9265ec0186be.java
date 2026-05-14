import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeBucket);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int newDay = (day-1)/dayStep*dayStep+1;

        return TimeUtils.getTimeBucket(year,month,newDay);
    }
}