import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = readUnsignedByte();
        if (tag == 0) {
            return 0;
        }
        int shift = 8 - TAG_TYPE_BITS;
        while (shift > 0 && (tag & (1 << shift)) == 0) {
            shift -= TAG_TYPE_BITS;
        }
        if (shift < 0) {
            throw new IOException("Invalid tag");
        }
        return tag >>> shift;
    }
}