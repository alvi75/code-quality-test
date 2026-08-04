import java.util.*;

public class Translation867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount) {
    byteBuffer.limit(_limit * SizeOf.SHORT);
    byteBuffer.position(_position * SizeOf.SHORT);
    if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    else {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    this._position += shortCount;
    return this;
}
}