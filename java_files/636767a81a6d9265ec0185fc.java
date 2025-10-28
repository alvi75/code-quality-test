import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = in.read();
        if (tag == 0) {
            return 0;
        }
        return tag << TAG_TYPE_BITS | (in.available() - 1);
    }
}