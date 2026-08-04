import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    public void accept(final METRICS data) {
        final String id = data.getId();
        final METRICS existing = buffer.get(id);
        if (existing == null) {
            buffer.put(id, data);
        } else {
            final METRICS combined = combine(existing, data);
            if (combined == null) {
                buffer.remove(id);
            } else {
                buffer.put(id, combined);
            }
        }
    }
}