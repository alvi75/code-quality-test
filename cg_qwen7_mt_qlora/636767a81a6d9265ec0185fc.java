import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    /**Return a field tag, and if reach the EOF the tag will be zero.It will throw an exception when the tag is equal to zero after logical shift right  TAG_TYPE_BITS.*/
    public int readTag()
        throws IOException {
        if (mPos >= mEnd) {
            return 0;
        }
        int tag = readVarint();
        if ((tag >>> TAG_TYPE_BITS) == 0) {
            throw new IOException("Protocol message contained an invalid tag at end of the stream.");
        }
        return tag;
    }
}