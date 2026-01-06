import java.util.*;

public class Generated_6367670b1a6d9265ec0179fe {
    @Override
  public void write(byte b[]) throws IOException {
    if (b == null) {
      throw new NullPointerException("null bytes");
    }
    int len = b.length;
    if (len > 0) {
      if (out != null) {
        out.write(b, 0, len);
      } else {
        throw new IllegalStateException("no output stream");
      }
    }
  }
}