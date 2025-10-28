import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor) {
        if (descriptor.length() == 0) {
            return;
        }
        final int index = descriptor.indexOf(':');
        if (index < 0) {
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
        final String type = descriptor.substring(0, index).toUpperCase();
        final String value = descriptor.substring(index + 1);
        this.valueMap.put(type, value);
    }
}