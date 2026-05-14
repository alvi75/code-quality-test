import java.util.*;

public class Translation460 {
    public synchronized void write(char[] buffer, int offset, int len) {
    Arrays.checkOffsetAndCount(buffer.length, offset, len);
    expand(len);
    System.arraycopy(buffer, offset, this.buf, this.count, len);
    this.count += len;
}
}