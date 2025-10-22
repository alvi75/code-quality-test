import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    /**
 * Write the byte array b to the buffer based on the encoding.
 **/
@Override
    public void write(final byte[] b) throws IOException {
        if (b == null) {
            throw new NullPointerException("The argument 'b' is null");
        }
        int len = b.length;
        for (int i = 0; i < len; i++) {
            write(b[i]);
        }
    }
}