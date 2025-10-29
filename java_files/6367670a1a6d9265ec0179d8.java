import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException("The byte array cannot be null");
        }
        final int len = b.length;
        for (int i = 0; i < len; i++) {
            write(b[i]);
        }
    }
}