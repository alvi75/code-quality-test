import java.util.*;

public class Translation786 {
    public Long get(CharSequence key) {
    int bucket = normalCompletion.getBucket(key);
    return bucket == -1 ? null : Long.valueOf(bucket);
}
}