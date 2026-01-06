import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    /**Write the byte array b to the buffer based on the encoding.**/
  @Override
  public void write(final byte[] b) throws IOException {
    if (b == null) {
      throw new NullPointerException();
    }
    int len = b.length;
    if (len > Integer.MAX_VALUE) {
      throw new IllegalArgumentException("byte array too long: " + len);
    }
    int pos = position;
    int limit = pos + len;
    while (pos < limit) {
      int c = b[pos];
      if (c >= 0 && c <= 127) {
        out.write(c);
      } else if (c >= 128 && c <= 191) {
        out.write((char) ((c & 0x3f) << 6) | (b[pos + 1] & 0x3f));
        pos += 2;
      } else if (c >= 224 && c <= 255) {
        out.write((char) (((c & 0x3f) << 12) | ((c & 0xC0) >> 6)) |
            ((b[pos + 1] & 0x3f) << 6) | (b[pos + 2] & 0x3f));
        pos += 3;
      } else {
        throw new IOException("invalid byte for encoding");
      }
    }
    position = limit;
  }
}