import java.util.*;

public class Translation726 {
    public CharBuffer put(char[] src, int srcOffset, int charCount) {
    assert _isReadOnly == false;
    assert _hasArray == true;
    assert _array == _charArray;
    assert _offset == 0;
    assert _limit >= _position;
    assert byteBuffer instanceof ReadWriteDirectByteBuffer || byteBuffer instanceof ReadWriteHeapByteBuffer;
    assert byteBuffer.isReadOnly() == false;
    if (byteBuffer instanceof ReadWriteDirectByteBuffer) {
        ((ReadWriteDirectByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else if (byteBuffer instanceof ReadWriteHeapByteBuffer) {
        ((ReadWriteHeapByteBuffer) byteBuffer).put(src, srcOffset, charCount);
    }
    else {
        throw new IllegalStateException();
    }
    _position += charCount;
    return this;
}
}