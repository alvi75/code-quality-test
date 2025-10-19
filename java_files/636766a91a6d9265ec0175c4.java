import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor) {
        if (descriptor.length() == 0)
            throw new IllegalArgumentException("Empty descriptor");
        char c = descriptor.charAt(0);
        switch (c) {
            case 'V':
                break;
            case 'I':
                value = getInt();
                break;
            case 'D':
                value = getDouble();
                break;
            case 'F':
                value = getFloat();
                break;
            case 'J':
                value = getLong();
                break;
            case 'B':
                value = getByte();
                break;
            case 'S':
                value = getShort();
                break;
            default:
                throw new IllegalArgumentException("Illegal descriptor: " + descriptor);
        }
    }
}