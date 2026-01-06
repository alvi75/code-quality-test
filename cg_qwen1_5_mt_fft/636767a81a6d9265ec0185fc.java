import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag() throws IOException {
        int tag = in.read();
        if (tag == -1) {
            return 0;
        }
        // check for EOI
        if ((tag & ~TAG_MASK) == 0) {
            return 0;
        }

        // check for EOF
        if ((tag & TAG_EOI) != 0) {
            return 0;
        }

        // check for unknown tag type
        if ((tag & TAG_TYPE_BITS) == 0) {
            throw new IllegalArgumentException("Unknown tag type: " + Integer.toHexString(tag));
        }

        // check that we have enough bytes left to form a full tag
        if (in.available() < 2) {
            throw new IOException("Not enough bytes to form a tag");
        }

        // get tag length from LSB two bytes of first byte
        int len = (tag & TAG_LENGTH_MASK);
        if (len > 0) {
            len = len << 8;
            len += in.read();
        } else {
            // if len == 0 then it's an unknown length tag
            // TODO: implement support for unknown length tags
            throw new UnsupportedOperationException("Unknown length tag");
        }

        // skip padding bits
        while (in.available() > 0 && in.read() == 0) {
            // do nothing
        }

        // skip rest of tag data
        in.skip(len);

        return tag;
    }
}