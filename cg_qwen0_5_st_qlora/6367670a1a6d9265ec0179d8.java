import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException("b");
        }
        int len = b.length;
        if (len > 0) {
            int pos = position;
            int limit = position + len;
            while (pos < limit) {
                int c = b[pos];
                if (c == -1) {
                    break;
                }
                write(c);
                pos++;
            }
        }
    }
}