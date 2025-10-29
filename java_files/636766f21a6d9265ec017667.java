import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        return (short) ((classFileBuffer[offset] & 0xff) | ((classFileBuffer[offset + 1] & 0xff) << 8));
    }
}