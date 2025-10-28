import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o) {
        if (o == null)
            return;
        int len = o.getFormattedMessage().length();
        if (len > buf.length) {
            // Grow the buffer.
            byte[] newbuf = new byte[buf.length + (len >> 2)];
            System.arraycopy(buf, 0, newbuf, 0, buf.length);
            buf = newbuf;
        }
        buf[o.getFormattedMessage().hashCode() & 0x7f] = o.getMessage();
    }
}