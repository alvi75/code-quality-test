import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
  /**Write the given byte array b into the output stream that this class represents.**/
  public void write(byte b[]) throws IOException {
    if (b == null) {
      throw new NullPointerException("b is null");
    }
    int len = b.length;
    if (len > buf.length - pos) {
      flushBuffer();
    }
    System.arraycopy(b, 0, buf, pos, len);
    pos += len;
  }
}