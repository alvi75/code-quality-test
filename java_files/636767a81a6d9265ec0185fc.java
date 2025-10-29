import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = readUnsignedShort();
        if (tag == 0) {
            throw new IOException("Unexpected end of stream");
        }
        return tag;
    }
}