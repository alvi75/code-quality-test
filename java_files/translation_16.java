import java.util.*;

public class Translation16 {
    public synchronized int read(byte[] buffer, int offset, int length) {
    if (buffer == null) {
        throw new NullPointerException("buffer == null");
    }
    Arrays.checkOffset( buffer.length, offset, length );
    if (length == 0) {
        return 0;
    }
    final int copyLen = count-pos < length ? count-pos : length;
    for (int i=0;
    i<copyLen;
    i++) {
        buffer[offset+i] = getBuffer()[pos++];
    }
    return copyLen;
}
}