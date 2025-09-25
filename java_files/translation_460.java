import java.util.*;

public class Translation460 {
    public synchronized void write(char[] buffer, int offset, int len) {
    checkOffsetAndCount(buffer.length, offset, len);
    ensureCapacity(len);
    System.arraycopy(buffer, offset, buf, count, len);
    count += len;
}
}