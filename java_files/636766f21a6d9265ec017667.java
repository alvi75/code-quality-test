import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    /**Read a short value from classFileBuffer**/
    public short readShort(final int offset){
        final byte[] buffer = new byte[2];
        try {
            classFileBuffer.position(offset);
            classFileBuffer.get(buffer);
        } catch (final IOException e) {
            throw new IllegalArgumentException("could not get bytes from buffer");
        }
        return ByteUtils.toShort(buffer);
    }
}