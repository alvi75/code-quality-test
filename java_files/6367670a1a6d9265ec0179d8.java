import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException("null");
        }
        int len = b.length;
        if (len < 0 || len > 65535) {
            throw new IllegalArgumentException("length out of range: " + len);
        }
        if (this.buffer.position() + len > this.buffer.limit()) {
            // grow the buffer
            final byte[] oldBuffer = this.buffer.array();
            final int oldLength = this.buffer.limit();
            final byte[] newBuffer = new byte[oldLength * 2];
            System.arraycopy(oldBuffer, 0, newBuffer, 0, oldLength);
            this.buffer = newBuffer;
        }
        for (int i = 0; i < len; ++i) {
            this.buffer.put(b[i]);
        }
    }
}