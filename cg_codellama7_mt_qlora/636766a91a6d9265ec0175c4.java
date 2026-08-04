import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    public void pop(String descriptor) {
        switch (descriptor.charAt(0)) {
            case 'Z':
            case 'B':
            case 'C':
            case 'S':
            case 'I':
            case 'F':
                pop(Type.INT);
                break;
            case 'J':
            case 'D':
                pop2();
                break;
            case 'L':
            case '[':
                pop(Type.getObjectType(descriptor));
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}