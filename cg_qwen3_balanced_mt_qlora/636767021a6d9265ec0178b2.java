import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor) {
        if (descriptor.charAt(0) == 'L') {
            // Class or interface.
            popClass();
        } else if (descriptor.charAt(0) == '[') {
            // Array.
            int dim = 1;
            while (descriptor.charAt(dim) == '[') {
                dim++;
            }
            if (descriptor.charAt(dim) == 'L') {
                // Inner class.
                popClass();
            } else {
                // Primitive array.
                pop(dim);
            }
        } else {
            // Primitive type.
            switch (descriptor.charAt(0)) {
                case 'B':
                    popByte();
                    break;
                case 'C':
                    popChar();
                    break;
                case 'D':
                    popDouble();
                    break;
                case 'F':
                    popFloat();
                    break;
                case 'I':
                    popInt();
                    break;
                case 'J':
                    popLong();
                    break;
                case 'S':
                    popShort();
                    break;
                case 'Z':
                    popBoolean();
                    break;
                case 'V':
                    break;
                default:
                    throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
            }
        }
    }
}