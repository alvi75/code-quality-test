import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    /**Pop different value of type based on the first character of the given descriptor.
 * @param descriptor The descriptor to use for determining which value to pop.
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
            case 'Z':
                stack.popBoolean();
                break;
            default:
                if (descriptor.length() > 1 && descriptor.charAt(1) == 'V') {
                    // Pop a reference, but don't push it onto the stack.
                    stack.popReference();
                } else {
                    throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
                }
        }
    }
}