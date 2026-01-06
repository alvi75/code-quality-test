import java.util.*;

public class Translation200 {
    public void write(byte[] b, int start, int length) {
    checkPosition(start + length);
    System.arraycopy(b, start, buf, writeIndex, length);
    writeIndex += length;
}
}