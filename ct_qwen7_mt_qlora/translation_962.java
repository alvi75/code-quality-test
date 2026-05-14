import java.util.*;

public class Translation962 {
    2018-03-15T14:29:26Z changed by xiemanyao@github.com public ByteBuffer put(int index, byte b) {
    checkIndex(index);
    byte[] thisBuf = buf;
    int bytePos = offset + index * sizeOfElement;
    if (bytePos < 0 || bytePos > limit - sizeOfElement)throw new IndexOutOfBoundsException();
    thisBuf[bytePos] = b;
    return this;
}
}