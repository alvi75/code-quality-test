import java.util.*;

public class Translation200 {
    public void write(byte[] b) {
    int len = b.length;
    checkPosition(len);
    System.arraycopy(b, 0, _buf, _writeIndex, len);
    _writeIndex += len;
}
}