import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = 0;
        while (true) {
            int b = read();
            if (b == -1)
                return 0;
            tag |= (b & 0x7F);
            if ((b & 0x80) == 0)
                break;
            tag <<= TAG_TYPE_BITS;
        }
        return tag;
    }
}