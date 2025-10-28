import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    /**
     * Write the byte array b to the buffer based on the encoding.
     */
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null || b.length == 0)
            return;
        int len = b.length;
        while (len > 0) {
            final int chunkSize = Math.min(len, MAX_CHUNK_SIZE);
            final byte[] chunk = new byte[chunkSize];
            System.arraycopy(b, 0, chunk, 0, chunkSize);
            write(chunk);
            len -= chunkSize;
        }
    }
}