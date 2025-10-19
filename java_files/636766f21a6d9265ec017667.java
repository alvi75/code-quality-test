import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        if (offset < 0 || offset >= length)
            throw new IndexOutOfBoundsException();
        return (short) ((classfileBytes[offset + 1] & 0xFF) | (classfileBytes[offset] & 0xFF) << 8);
    }
}