import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (object instanceof Set) {
        Set<?> s = (Set<?>) object;
        try {
            return size() == s.size()&& containsAll(s);
        }
        s.isEmpty()) {
            return true;
        }
        else if (s instanceof Multiset) {
            Multiset<?> m = (Multiset<?>) object;
            return countMap.equals(m.countMap);
        }
        else if (s instanceof Map.Entry) {
            Object entry = s.entrySet().iterator().next();
            return countMap.containsKey(entry.getKey())&& countMap.get(entry.getKey()).intValue()==entry.getValue();
        }
        return false;
    }
}