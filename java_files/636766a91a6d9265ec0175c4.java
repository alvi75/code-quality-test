import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**
     * Pop different value of type based on the first character of the given descriptor.
     */
    private void pop(final String descriptor) {
        final char c = descriptor.charAt(0);
        switch (c) {
            case 'B':
                stack.popByte();
                break;
            case 'C':
                stack.popChar();
                break;
            case 'D':
                stack.popDouble();
                break;
            case 'F':
                stack.popFloat();
                break;
            case 'I':
                stack.popInt();
                break;
            case 'J':
                stack.popLong();
                break;
            case 'S':
                stack.popShort();
                break;
            default:
                throw new IllegalArgumentException("Unknown type: " + c);
        }
    }
}