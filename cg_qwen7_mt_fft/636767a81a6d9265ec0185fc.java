import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag()
        throws IOException
    {
        // Read first byte.
        int b = _in.read();

        // If we reached end of file before reading type bits,
        // return -1.
        if (b == -1) {
            return -1;
        }

        // Else, put this byte back and get another one.
        else {
            _peek[0] = (byte)b;
            b = read();
        }

        // Return tag value shifted left by TAG_TYPE_BITS.
        return ((b & TAG_MASK) << TAG_TYPE_BITS);
    }
}