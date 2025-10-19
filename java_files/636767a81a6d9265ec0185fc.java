import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = in.read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & TAG_TYPE_MASK) != TAG_TYPE_MASK) {
            throw new IOException("Invalid tag: " + Integer.toHexString(tag));
        }

        //if (tag == 0x00) {
        //    throw new IOException("EOF");
        //}
        return tag >>> TAG_TYPE_BITS;
    }
}