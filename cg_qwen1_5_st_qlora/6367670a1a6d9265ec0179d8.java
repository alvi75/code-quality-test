import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    /**Write the byte array b to the buffer based on the encoding.**/
    public void write(final byte[] b) throws IOException {
        if (b == null || b.length == 0)
            return;
        int len = b.length;
        for (int i = 0; i < len; ++i) {
            final char c = (char) b[i];
            if (c >= 128) {
                //write the character as a surrogate pair.
                final int hi = c / 64 + 0xD800;
                final int lo = c % 64 + 0xDC00;
                this.buffer.write(hi);
                this.buffer.write(lo);
            } else {
                this.buffer.write(c);
            }
        }
    }
}