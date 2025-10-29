import java.util.*;

public class Generated_636767dc1a6d9265ec0186be {
    public static long compressTimeBucket(long timeBucket, int dayStep) {
        long result = 0;
        for (int i = 0; i < dayStep; i++) {
            result <<= 6;
            result |= (timeBucket & 0x3fffffff);
            timeBucket >>>= 6;
        }
        return result;
    }
}