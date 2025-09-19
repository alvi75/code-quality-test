import java.util.*;

public class Translation460 {
    public void write(char[] buf, int off, int len) {
    Arrays.checkOffsetbuf.length, off, len);
    synchronized (lock) {
        expand(len);
        System.arraycopy(buf, off, this.buf, this.count, len);
        this.count += len;
    }
}
}