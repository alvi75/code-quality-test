import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    public void pop(final String descriptor) {
        if (descriptor == null || descriptor.length() == 0) {
            return;
        }
        final int index = descriptor.indexOf(' ');
        if (index > -1) {
            final String key = descriptor.substring(0, index);
            final String value = descriptor.substring(index + 1);
            this.values.put(key, value);
        } else {
            this.values.put(descriptor, "");
        }
    }
}