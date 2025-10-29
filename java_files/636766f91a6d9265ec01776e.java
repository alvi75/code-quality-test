import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    /**Write bytes of length len from a byte array**/
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (len < 0 || off < 0 || len > buffer.length - off)
            throw new IllegalArgumentException("Invalid arguments");
        for (int i = off; i < off + len; i++) {
            buffer[i] = b[i - off];
        }
    }
}