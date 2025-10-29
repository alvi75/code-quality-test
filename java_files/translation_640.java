import java.util.*;

public class Translation640 {
    0;
int longCount = dst.length - dstOffset;
if (byteBuffer instanceof DirectByteBuffer) {
    ((DirectByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
}
else {
    ((HeapByteBuffer) byteBuffer).get(dst, dstOffset, longCount);
}
this._position += longCount;
return this;
}
}