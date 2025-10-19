import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    /**
 * Return a field tag, and if reach the EOF the tag will be zero.It will throw an exception when the tag is equal to zero after logical shift right 
 * TAG_TYPE_BITS.
 */
public int readTag() throws IOException {
    int tag = readUnsignedShort();
    if (tag == 0) {
      throw new IOException("Unexpected end of file");
    }
    return tag;
  }
}