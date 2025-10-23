import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset){
        final byte[] buffer = classFileBuffer;
        return (short) ((buffer[offset] & 0xff) << 8 | (buffer[offset + 1] & 0xff));
    }
}