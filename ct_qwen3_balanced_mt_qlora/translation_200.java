import java.util.*;

public class Translation200 {
    ublic void write(byte[] b) {
    final int len = b.length;
    checkPosition(len);
    System.arraycopy(b, 0, _buf, _writeIndex, len);
    _writeIndex += len;
}
}