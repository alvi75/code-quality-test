import java.util.*;

public class Translation640 {
    1 public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    2 byteBuffer.limit(limit() << 3);
    3 byteBuffer.position(position() << 3);
    4 if (byteBuffer instanceof DirectByteBuffer) {
        5 ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
        6 }
        else {
            7 ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
            8 }
            9 position(position() + longCount);
            10 return this;
        }
}