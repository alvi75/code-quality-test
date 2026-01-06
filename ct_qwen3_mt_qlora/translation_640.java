import java.util.*;

public class Translation640 {
    2019-04-15, @jlevenson suggested: public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    byteBuffer.limit(limit * SizeOf.LONG);
    byteBuffer.position(position * SizeOf.LONG);
    if (byteBuffer instanceof DirectByteBuffer) {
        (DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    else {
        (HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    position += longCount;
    return this;
}
}