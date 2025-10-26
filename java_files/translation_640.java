import java.util.*;

public class Translation640 {
    public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    checkIndex(longCount);
    byteBuffer.limit(limit() * SIZE_OF_LONG);
    byteBuffer.position(position() * SIZE_OF_LONG);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    else {
        ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    this.position += longCount;
    return this;
}
}