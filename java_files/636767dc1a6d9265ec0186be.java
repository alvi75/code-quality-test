import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        int year = (int)(timeBucket/10000);
        int month = (int)((timeBucket%10000)/100);
        int day = (int)(timeBucket%100);

        //dayStep is a multiple of 7
        int offset = day/dayStep;
        day -= offset;

        return ((year*10000 + month*100 + day)*10000 + 144000000L);
    }
}