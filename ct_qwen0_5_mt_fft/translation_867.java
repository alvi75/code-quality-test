import java.util.*;

public class Translation867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
    byteBuffer.limit(limit * SizeOf.SHORT);
    byteBuffer.position(position * SizeOf.SHORT);
    if (byteBuffer instanceof ReadableDirectByteBuffer) {
        ((ReadableDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    else {
        ((ReadableHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    position += shortCount;
    return this;
}
}