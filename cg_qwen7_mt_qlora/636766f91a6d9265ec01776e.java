import java.util.*;

public class Generated_636766f91a6d9265ec01776e {
    @Override
    public void write(final byte b[], final int off, final int len)
        throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length - len) || (len < 0)) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < len; ++i) {
            this.write(b[off + i]);
        }
    }
}