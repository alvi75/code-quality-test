import java.util.*;

public class Translation867 {
    public ShortBuffer put(short[] src, int srcOffset, int shortCount ) {
    checkOffsetAndCount(src.length, srcOffset, shortCount);
    byteBuffer.limit(_limit * SizeOf.SHORT);
    byteBuffer.position(_position * SizeOf.SHORT);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    else {
        ((HeapByteBuffer) byteBuffer).put(src, srcOffset, shortCount);
    }
    this._position += shortCount;
    return this;
}
}