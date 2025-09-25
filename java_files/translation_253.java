import java.util.*;

public class Translation253 {
    public int readUShort() {
    final byte[] b = _buffer;
    final int offset = _offset;
    _offset += 2;
    return ((b[offset] & 0xFF) << 8) | (b[offset + 1] & 0xFF);
}
}