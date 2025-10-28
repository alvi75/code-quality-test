import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data) {
        final String key = data.key;
        final String value = data.value;

        if (key == null || value == null) {
            return;
        }

        // If we have a new key, add it to the buffer.
        if (!buffer.containsKey(key)) {
            buffer.put(key, value);
        } else {
            // If we already have a value for this key, combine it with the existing value.
            final String existingValue = buffer.get(key);

            if (existingValue != null && !existingValue.equals(value)) {
                // If the existing value is different from the new one, remove the old value from the buffer.
                buffer.remove(key);
            }
            // Add the new value to the buffer.
            buffer.put(key, value);
        }
    }
}