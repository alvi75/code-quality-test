import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    /**Write bytes of length len from a byte array**/ 
    @Override
    public void write(final byte b[],final int off,final int len) throws IOException {
        if (len < 0 || off < 0 || off > b.length - len) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = off; i < off + len; i++) {
            out.write(b[i]);
        }
    }
}