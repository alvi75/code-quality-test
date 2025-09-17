import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_252 {
    public E pollLast() {
        Map.Entry<E, Object> entry = backingMap.pollLastEntry();
        return (entry == null) ? null : entry.getKey();
    }
}