import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.*/
    private void pop(final String descriptor) {
        switch (descriptor.charAt(0)) {
            case 'i':
                popInt();
                break;
            case 'f':
                popFloat();
                break;
            case 'd':
                popDouble();
                break;
            case 'j':
                popLong();
                break;
            case 's':
                popShort();
                break;
            case 'c':
                popChar();
                break;
            case 'z':
                popBoolean();
                break;
            case 'b':
                popByte();
                break;
            case 'l':
                popLong();
                break;
            case 'L':
                popClass();
                break;
            default:
                throw new IllegalStateException("Unknown descriptor: " + descriptor);
        }
    }
}