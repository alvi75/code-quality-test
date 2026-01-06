import java.util.*;

public class Translation200 {
    ublic void write(byte[] b) {
    final int len = b.length;
    checkPosition(len);
    System.arraycopy(b, 0, buf, writeIndex, len);
    writeIndex += len;
}
}