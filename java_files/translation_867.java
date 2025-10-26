import java.util.*;

public class Translation867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
    byteBuffer.limit(limit() << 1);
    byteBuffer.position(position() << 1);
    if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    else {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    this.position += shortCount;
    return this;
}
}