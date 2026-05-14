import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override public void write(final byte b[],final int off,final int len) throws IOException {
        if (len == 0) return;
        if (len < 0) throw new IllegalArgumentException("len < 0");
        if (off < 0 || off > b.length - len) throw new IndexOutOfBoundsException();
        while (len > 0) {
            final int n = out.write(b, off, len);
            off += n;
            len -= n;
        }
    }
}