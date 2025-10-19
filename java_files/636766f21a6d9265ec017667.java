import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        try {
            return (short) ((classFileBuffer[offset] & 0xFF)
                    | ((classFileBuffer[offset + 1] & 0xFF)) << 8);
        } catch (IndexOutOfBoundsException e) {
            throw new ClassfileFormatException("Class file format error: "
                    + "invalid short at offset " + offset, e);
        }
    }
}