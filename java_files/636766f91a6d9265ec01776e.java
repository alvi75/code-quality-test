import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[], final int off, final int len)
            throws IOException {
        if (off < 0 || len < 0 || off + len > b.length) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return;
        }

        // If we're not in append mode, then we need to check for
        // truncation.
        if (!appendMode && !checkTruncation(off, len)) {
            throw new EOFException("Stream closed");
        }

        // Write the data
        synchronized (lock) {
            if (out != null) {
                out.write(b, off, len);
            } else {
                buffer.append(new String(b, off, len));
            }
        }
    }
}