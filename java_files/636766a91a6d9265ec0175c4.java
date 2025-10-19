import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**
 * /**Pop different value of type based on the first character of the given descriptor.
 **/
private void pop(final String descriptor) {
        final char c = descriptor.charAt(0);
        switch (c) {
            case 'I':
                popInt();
                break;
            case 'F':
                popFloat();
                break;
            case 'J':
                popLong();
                break;
            case 'D':
                popDouble();
                break;
            case 'L':
                popObject();
                break;
            case '[':
                popArray();
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}