import java.util.*;

public class Translation726 {
    public CharBuffer put(char[] src, int srcOffset, int charCount) {
    byteBuffer.limit(limit() * SizeOf.CHAR);
    byteBuffer.position(position() * SizeOf.CHAR);
    if (byteBuffer instanceof DirectByteBuffer) {
        ((DirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else {
        ((HeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    position() += charCount;
    return this;
}
}