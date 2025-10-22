import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (len == 0) return;
        if (b == null) throw new NullPointerException();
        if (off < 0 || off > b.length) throw new IndexOutOfBoundsException();
        if (off + len > b.length) throw new IndexOutOfBoundsException();
        if (off + len < 0) throw new IndexOutOfBoundsException();

        if (len <= buffer.remaining()) {
            buffer.put(b, off, len);
        } else {
            flush();
            out.write(b, off, len);
        }
    }
}