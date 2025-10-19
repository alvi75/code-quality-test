import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = data.getMetricId();
        if (this.buffer.containsKey(key)) {
            //combine the new data with the old one
            this.buffer.put(key, this.combiner.combine(this.buffer.get(key), data));
            if (!this.combiner.isAbandoned(this.buffer.get(key))) {
                //if the combined data is not abandoned, then we can add it back to the buffer
                this.buffer.put(key, this.combiner.combine(this.buffer.get(key), data));
            } else {
                //otherwise, we need to remove it from the buffer
                this.buffer.remove(key);
            }
        } else {
            //if the key does not exist in the buffer, then we can just add it
            this.buffer.put(key, data);
        }
    }
}