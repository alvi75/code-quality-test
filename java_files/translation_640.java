import java.util.*;

public class Translation640 {
    public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    byteBuffer.limit(limit * SizeOf.LONG);
    byteBuffer.position(position * SizeOf.LONG);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    }
    long[] array = new long[dst.length];
    byteBuffer.get(array);
    for (int i = 0;
    i < longCount;
    ++i) {
        dst[dstOffset++] = array[i];
    }
    return this;
}
else {
    ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
    position += longCount;
    return this;
}
}
}