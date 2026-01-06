import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.*/
    private void pop(final String descriptor) {
        final char c = descriptor.charAt(0);
        switch (c) {
            case 'i':
                stack.popInt();
                break;
            case 'j':
                stack.popLong();
                break;
            case 'f':
                stack.popFloat();
                break;
            case 'd':
                stack.popDouble();
                break;
            case 'l':
                stack.popRef();
                break;
            case 'z':
                stack.popBoolean();
                break;
            case 's':
                stack.popChar();
                break;
            case 't':
                stack.popType();
                break;
            default:
                throw new IllegalStateException("Unknown descriptor: " + descriptor);
        }
    }
}