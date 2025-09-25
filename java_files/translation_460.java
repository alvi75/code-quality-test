import java.util.*;

public class Translation460 {
    public void write(char[] buffer, int offset, int len) {
    if (len > 0) {
        int newLen = count + len;
        ensureCapacity(newLen);
        System.arraycopy(buffer, offset, buf, count, len);
        count += len;
    }
}
}