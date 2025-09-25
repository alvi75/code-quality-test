import java.util.*;

public class Translation640 {
    public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    ByteBuffer.limit(limit() << SizeOf.LONG);
    ByteBuffer.position(position() << SizeOf.LONG);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    else {
        ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    position(position() + longCount);
    return this;
}
}