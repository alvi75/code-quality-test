import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final long timestamp = System.currentTimeMillis();
        final String key = data.getKey();
        final int id = data.getId();
        final double value = data.getValue();

        // If the key already exists, we need to check if the new value should be added or not.
        if (buffer.containsKey(key)) {
            final METRICS oldData = buffer.get(key);
            final double oldValue = oldData.getValue();
            final double newValue = value;

            // If the new value is greater than the old value, then we can replace the old value.
            if (newValue > oldValue) {
                buffer.put(key, new METRICS(id, key, newValue));
            } else {
                // If the new value is less than the old value, then we need to check if the old value is abandoned.
                if (!oldData.isAbandoned()) {
                    // If the old value is not abandoned, then we need to check if the new value is abandoned.
                    if (data.isAbandoned()) {
                        // If the new value is abandoned, then we can replace the old value.
                        buffer.put(key, new METRICS(id, key, newValue));
                    }
                }
            }

            // If the old value was abandoned, then we need to remove it from the buffer.
            if (oldData.isAbandoned()) {
                buffer.remove(key);
            }
        } else {
            // If the key does not exist, then we can add it to the buffer.
            buffer.put(key, new METRICS(id, key, value));
        }

        // If the buffer is full, then we need to remove the oldest value.
        if (buffer.size() >= maxBufferSize) {
            final Iterator<Entry<String, METRICS>> iterator = buffer.entrySet().iterator();
            Entry<String, METRICS> entry = null;
            while (iterator.hasNext()) {
                entry = iterator.next();
                break;
            }

            if (entry != null) {
                buffer.remove(entry.getKey());
            }
        }
    }
}