import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = 0;
        while (true) {
            int b = in.read();
            if (b == -1)
                return tag;

            tag <<= 7;
            tag |= b & 0x7f;
            if ((tag & 0x80) != 0)
                return tag;
        }
    }
}