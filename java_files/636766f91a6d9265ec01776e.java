import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[], final int off, final int len)
            throws IOException {
        if (len == 0) return;
        if (off < 0 || off > b.length - len) throw new IndexOutOfBoundsException();
        if (len > Integer.MAX_VALUE) throw new IllegalArgumentException("length too large");
        if (len < 0) throw new IllegalArgumentException("negative length");

        // If we have no data to write, just return.
        if (b.length - off < len) return;

        // Write the data in one go.
        int n = Math.min(len, buffer.length);
        System.arraycopy(b, off, buffer, 0, n);
        if (n != len) {
            // We need more space than we have available.
            // Copy the rest of the data into a temporary buffer.
            System.arraycopy(b, off + n, buffer, n, buffer.length - n);
            // Write the remaining data.
            write(buffer, 0, buffer.length);
        }
    }
}