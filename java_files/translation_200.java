import java.util.*;

public class Translation200 {
    public void write(byte [] b) {
    final int len = b.length;
    if (len == 0) return;
    if (_writeIndex + len > _limit)throw new BufferOverflowException();
    System.arraycopy(b, 0, _buf, _writeIndex, len);
    _writeIndex += len;
}
}