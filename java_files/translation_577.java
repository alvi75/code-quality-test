import java.util.*;

public class Translation577 {
    public boolean contains(Object o) {
    if (!(o instanceof Map.Entry))return false;
    Map.Entry<?,?> e = (Map.Entry<?,?>)o;
    V v = ConcurrentHashMap.this.get(e.getKey());
    return v != null && strategy.equalValues(v, e.getValue());
}
}