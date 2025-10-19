import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null || b.length == 0)
            return;
        final int len = b.length;
        for (int i = 0; i < len; i++) {
            final int c = b[i];
            if (c >= 0x80) {
                buf[position++] = (byte) 0x80;
                buf[position++] = (byte) (c & 0xFF);
                buf[position++] = (byte) ((c >> 8) & 0xFF);
                buf[position++] = (byte) ((c >> 16) & 0xFF);
                buf[position++] = (byte) ((c >> 24) & 0xFF);
            } else {
                buf[position++] = (byte) c;
            }
        }
    }
}