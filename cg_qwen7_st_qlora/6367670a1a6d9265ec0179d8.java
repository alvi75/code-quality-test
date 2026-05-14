import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null)
            throw new NullPointerException();
        int len = b.length;
        if (len > 0) {
            ensureCapacity(count + len);
            System.arraycopy(b, 0, buf, count, len);
            count += len;
        }
    }
}