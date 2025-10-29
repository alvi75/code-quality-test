import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = 0;
        int b = in.read();
        while (b == 0) {
            tag |= ((int) (b & 0xFF)) << (TAG_TYPE_BITS);
            b = in.read();
        }
        return tag;
    }
}