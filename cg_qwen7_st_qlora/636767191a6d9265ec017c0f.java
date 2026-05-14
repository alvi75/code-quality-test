import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    private void enlarge(final int size){
        final byte[] newbuf = new byte[buf.length + size];
        System.arraycopy(buf, 0, newbuf, 0, buf.length);
        buf = newbuf;
    }
}