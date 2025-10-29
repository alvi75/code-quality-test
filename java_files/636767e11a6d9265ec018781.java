import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = data.getId();
        if (this.buffer.containsKey(key)) {
            this.buffer.get(key).accept(data);
        } else {
            this.buffer.put(key, new BufferEntry<>(data));
        }
    }
}