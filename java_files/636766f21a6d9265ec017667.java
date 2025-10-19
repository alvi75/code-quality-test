import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    /**Read a short value from classFileBuffer**/
public short readShort(final int offset){
        if (offset + 2 > classFileBuffer.length) {
            throw new IllegalArgumentException("Offset " + offset + " is out of bounds for class file");
        }
        return (short)((classFileBuffer[offset] & 0xFF) << 8 | (classFileBuffer[offset + 1] & 0xFF));
    }
}