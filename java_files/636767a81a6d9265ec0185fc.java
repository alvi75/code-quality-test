import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    /**Return a field tag, and if reach the EOF the tag will be zero.It will throw an exception when the tag is equal to zero after logical shift right  TAG_TYPE_BITS.*/
    public int readTag() throws IOException {
        int tag = 0;
        while (true) {
            tag = in.read();
            if (tag != -1) break;
        }
        return tag;
    }
}