import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset){
        final byte b1 = classFileBuffer.get(offset);
        final byte b2 = classFileBuffer.get(offset + 1);

        return (short) ((b1 & 0xFF) << 8 | (b2 & 0xFF));
    }
}