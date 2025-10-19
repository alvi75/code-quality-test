import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = getKey(data);
        final Long previous = this.data.put(key, data.getTimestamp());
        if (previous == null || previous < data.getTimestamp()) {
            // If we have a new record, or the old one was older than this one, then we can just keep going.
            this.metrics.add(data);
        } else if (previous > data.getTimestamp()) { // If the old record was newer than this one, then we need to check for a collision.
            // Note that we only care about collisions between records with the same timestamp.
            final METRICS oldMetrics = this.data.remove(key);
            if (oldMetrics != null && oldMetrics.getTimestamp() >= data.getTimestamp()) {
                // We found a collision! We need to abandon the current record, and use the old one instead.
                this.metrics.clear();
                this.metrics.add(oldMetrics);
                this.metrics.add(data);
            }
        }
    }
}