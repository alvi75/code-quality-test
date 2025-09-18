import java.util.*;

public class Translation786 {
    public Object get(CharSequence key) {
    int bucket = normalCompletion.getBucket(key);
    if (bucket == -1) {
        return null;
    }
    return (Object) buckets[bucket];
}
}