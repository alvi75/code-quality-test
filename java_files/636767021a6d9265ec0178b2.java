import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        if (descriptor.length() == 0)
            return;

        final int index = descriptor.indexOf(':');
        if (index < 0)
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);

        final String name = descriptor.substring(0, index);
        final String value = descriptor.substring(index + 1);

        if (!name.equals(""))
            this.values.put(name, value);
    }
}