import java.util.*;

public class Translation786 {
    public Object get(CharSequence key) {
    int bucket = normalCompletion.getBucket(key);
    return bucket == -1 ? null : buckets.get(bucket);
}
}