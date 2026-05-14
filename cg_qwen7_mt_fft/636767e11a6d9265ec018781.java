import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final T key = getKey(data);
        final AtomicReference<V> ref = map.get(key);

        // If this is a new entry or we're replacing an old one...
        if (ref == null || ref.compareAndSet(null, data)) {

            // ...we need to insert/replace the new value.
            V val = data.getValue();
            if (val != null && !map.containsKey(val)) { // Only add new values!
                map.put(val, data);
            }

            // Cleanup: Remove any entries that were replaced by other ones.
            for (Iterator<Map.Entry<T, AtomicReference<V>>> iter = map.entrySet().iterator(); iter.hasNext();) {
                Map.Entry<T, AtomicReference<V>> e = iter.next();
                if (e.getValue().get() == null) {
                    iter.remove();
                }
            }
        } else {
            LOG.debug("Skipping duplicate metric {}", data);
        }
    }
}