import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        if (descriptor.length() == 0)
            return;

        char c = descriptor.charAt(0);
        switch (c) {
            case 'V':
                break;
            case '[':
                descriptor = descriptor.substring(1, descriptor.length() - 1);
                while (descriptor.endsWith("[]"))
                    descriptor = descriptor.substring(0, descriptor.length() - 2);
                break;
            default:
                throw new IllegalArgumentException(descriptor + " is not a valid type descriptor");
        }
    }
}