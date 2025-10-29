import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (len == 0) return;
        if (b == null) throw new NullPointerException();
        if (off < 0 || off > b.length) throw new IndexOutOfBoundsException();
        if (len < 0 || off + len > b.length) throw new IndexOutOfBoundsException();

        try {
            while (len > 0) {
                final int n = Math.min(len, buffer.length - pos);
                System.arraycopy(b, off, buffer, pos, n);
                off += n;
                pos += n;
                len -= n;

                if (pos >= buffer.length) flushBuffer();
            }
        } catch (final IOException e) {
            throw e;
        } catch (final Exception e) {
            throw new IOException(e.getMessage());
        }
    }
}