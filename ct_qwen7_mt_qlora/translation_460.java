import java.util.*;

public class Translation460 {
    1 public final synchronized void write(final char[] buffer,final int offset,final int len) {
    2 if (buffer == null) {
        3 throw new NullPointerException();
        4 }
        5 checkOffsetAndCount(buffer.length, offset, len);
        6 expand(len);
        7 System.arraycopy(buffer, offset, buf, count, len);
        8 count += len;
    }
}