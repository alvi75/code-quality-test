import java.util.*;

public class Translation867 {
    0;
int shortCount = src.length - srcOffset;
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