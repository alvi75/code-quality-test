import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        final int id = data.getId();
        synchronized (this) {
            // Check if this ID exists already.
            if (!buffer.containsKey(id)) {
                // Add the new data to the buffer.
                buffer.put(id, data);
            } else {
                // If the ID already exists, check if the data can be combined with the existing one.
                final Metrics existing = buffer.get(id);
                final boolean abandoned = !existing.data.equals(data.data);

                // If the data cannot be combined, remove the old data from the buffer.
                if (abandoned) {
                    buffer.remove(id);
                }
            }
        }
    }
}