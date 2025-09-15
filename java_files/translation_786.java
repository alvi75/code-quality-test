import java.util.*;

public class Translationtranslation_786 {
    public Object get(CharSequence key) {
        int bucket = normalCompletion.getBucket(key);
        if (bucket == -1) {
            return null;
        }
        return normalCompletion.getObjectAt(bucket);
    }
}