import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'L') {
            popClass();
        } else if (descriptor.charAt(0) == '[') {
            popArray();
        } else {
            popPrimitive();
        }
    }
}