import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    static long compressTimeBucket(long timeBucket,int dayStep){
        return (timeBucket/1000) * 1000 + (dayStep*60*60*24);
    }
}