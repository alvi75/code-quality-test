import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.**/
    private void pop(final String descriptor) {
        switch (descriptor.charAt(0)) {
            case 'B':
                this.byteValue = this.stack.pop().getByte();
                break;
            case 'C':
                this.charValue = this.stack.pop().getChar();
                break;
            case 'D':
                this.doubleValue = this.stack.pop().getDouble();
                break;
            case 'F':
                this.floatValue = this.stack.pop().getFloat();
                break;
            case 'I':
                this.intValue = this.stack.pop().getInt();
                break;
            case 'J':
                this.longValue = this.stack.pop().getLong();
                break;
            case 'S':
                this.shortValue = this.stack.pop().getShort();
                break;
            case 'Z':
                this.booleanValue = this.stack.pop().getBoolean();
                break;
            case 'V':
                this.stack.pop();
                break;
            default:
                throw new IllegalArgumentException("Invalid type: " + descriptor);
        }
    }
}