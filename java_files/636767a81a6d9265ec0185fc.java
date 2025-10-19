import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag()
        throws IOException
    {
        int tag = in.read();
        if (tag == -1) {
            return 0;
        }
        if ((tag & ~TAG_MASK) != 0) {
            throw new IOException("Invalid tag: " + tag);
        }
        return tag >>> TAG_TYPE_BITS;
    }
}