import java.util.*;

public class Translation200 {
    1 public final void write(byte[] b) {
    2 int len = b.length;
    3 checkPosition(len);
    4 System.arraycopy(b, 0, buf, writeIndex, len);
    5 writeIndex += len;
}
}