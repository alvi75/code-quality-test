import java.util.*;

public class Translation512 {
    public T merge(T first, T second) throws Exception {
    if (first == null && second == null)return null;
    if (first == null)return second;
    else if (second == null)return first;
    return getMerger().merge(first, second);
}
}