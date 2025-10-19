import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        //if (timeBucket >= 1000000000) {
            //return timeBucket;
        //}
        //else{
            return timeBucket + ((dayStep - 1) * 1000000000);
        //}
    }
}