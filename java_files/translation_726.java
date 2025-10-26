import java.util.*;

public class Translation726 {
    public CharBuffer put(char[] src, int srcOffset, int charCount) {
    byteBuffer.limit(limit() << 1);
    byteBuffer.position(position() << 1);
    if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    this.position += charCount;
    return this;
}
}