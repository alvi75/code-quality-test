import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = 0;
        int shift = 0;
        while (true) {
            int b = read();
            tag |= (b & 0x7f) << shift;
            if ((b & 0x80) == 0) {
                return tag;
            }
            shift += 7;
            if (shift >= TAG_TYPE_BITS) {
                throw new IOException("Corrupted input. The tag is too big.");
            }
        }
    }
}