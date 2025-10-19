import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = data.getId();
        // If we have a previous value for this metric, then try to combine them.
        if (this.buffer.containsKey(key)) {
            final MetricBufferEntry<METRICS> entry = this.buffer.get(key);
            final long now = System.currentTimeMillis();
            final long lastUpdated = entry.getLastUpdated();
            final long age = now - lastUpdated;
            final boolean abandon = age > MAX_AGE;
            if (abandon) {
                // We've been waiting too long for this data point, so just abandon it.
                this.buffer.remove(key);
            } else {
                // Combine the new data with the existing one.
                final METRICS combined = combine(entry.getData(), data);
                if (combined != null) {
                    entry.setData(combined);
                    entry.setLastUpdated(now);
                }
            }
        } else {
            // No previous value, so just add the new one.
            this.buffer.put(key, new MetricBufferEntry<>(
                    data,
                    System.currentTimeMillis()
            ));
        }
    }
}