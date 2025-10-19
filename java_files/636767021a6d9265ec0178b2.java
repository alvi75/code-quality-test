import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**
 * Pop the various value according to the first character of the descriptor.
 **/
private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'I') {
            popInt();
        } else if (descriptor.charAt(0) == 'J') {
            popLong();
        } else if (descriptor.charAt(0) == 'F') {
            popFloat();
        } else if (descriptor.charAt(0) == 'D') {
            popDouble();
        } else if (descriptor.charAt(0) == '[') {
            popArray(descriptor);
        } else if (descriptor.charAt(0) == 'L') {
            popObject(descriptor);
        } else if (descriptor.charAt(0) == 'Z') {
            popBoolean();
        }
    }
}