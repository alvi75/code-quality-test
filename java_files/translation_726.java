import java.util.*;

public class Translation726 {
    0;
int charCount = src.length - srcOffset;
if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
    ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
}
else {
    ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
}
this._position += charCount;
return this;
}
}