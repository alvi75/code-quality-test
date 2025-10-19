import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length) || (len < 0) ||
                   ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }

        synchronized (lock) {
            ensureOpen();

            final int available = count - pos;
            if (len <= available) {
                /* Copy the data directly into the buffer */
                System.arraycopy(b, off, buf, pos, len);
                pos += len;
                return;
            }
            /* Otherwise copy it to temp array */

            final byte temp[] = new byte[len];
            System.arraycopy(b, off, temp, 0, len);
            off += len;
            len = temp.length;

            writeTempBytes(temp, 0, len);
        }
    }
}