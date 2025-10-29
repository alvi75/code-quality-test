import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
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