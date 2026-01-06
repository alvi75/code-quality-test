import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        if(descriptor.length() == 0) return;
        final char c = descriptor.charAt(0);
        switch(c){
            case 'i':
                this.type = Type.INTEGER;
                break;
            case 'f':
                this.type = Type.FLOAT;
                break;
            case 'd':
                this.type = Type.DOUBLE;
                break;
            case 's':
                this.type = Type.STRING;
                break;
            case 'c':
                this.type = Type.CHAR;
                break;
            case 'b':
                this.type = Type.BOOLEAN;
                break;
            default:
                throw new IllegalArgumentException("Invalid type: " + c);
        }
    }
}