import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        if(descriptor.length() > 0) {
            final char c = descriptor.charAt(0);
            switch (c) {
                case 'F':
                    this.type = Type.FLOAT;
                    break;
                case 'I':
                    this.type = Type.INTEGER;
                    break;
                case 'B':
                    this.type = Type.BYTE;
                    break;
                case 'S':
                    this.type = Type.SHORT;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid type: " + c);
            }
        }
    }
}