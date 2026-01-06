import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.
 * @param descriptor The descriptor string.
 */
private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'B') { // byte
            this.byteValue = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'C') { // char
            this.charValue = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'D') { // double
            this.doubleValue = Double.parseDouble(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'F') { // float
            this.floatValue = Float.parseFloat(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'I') { // int
            this.intValue = Integer.parseInt(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'J') { // long
            this.longValue = Long.parseLong(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'S') { // short
            this.shortValue = Short.parseShort(descriptor.substring(1));
        } else if (descriptor.charAt(0) == 'Z') { // boolean
            this.booleanValue = Boolean.parseBoolean(descriptor.substring(1));
        }
    }
}