import java.util.*;

public class Translation605 {
    public ByteBuffer putShort(int offset, short b) {
    checkOffsetLimit(offset);
    byteBuffer.putShort(offset + position, (byte)b);
    return this;
}
}