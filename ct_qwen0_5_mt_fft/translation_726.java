import java.util.*;

public class Translation726 {
    public CharBuffer put(char[] src, int srcOffset, int charCount) {
    byteBuffer.limit(limit * SizeOf.CHAR);
    byteBuffer.position(position * SizeOf.CHAR);
    if (byteBuffer instanceof ReadableDirectByteBuffer) {
        ((ReadableDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else {
        ((ReadableHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    position += charCount;
    return this;
}
}