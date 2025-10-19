import java.util.*;

public class Generated_6367670a1a6d9265ec0179d8 {
    @Override
  public void write(final byte[] b) throws IOException {
    if (b == null) {
      throw new NullPointerException("Cannot write a null buffer");
    }
    final int len = b.length;
    if (len > 0) {
      switch (encoding) {
        case UTF_8:
          this.write(b, 0, len, Charset.forName("UTF-8"));
          break;
        case UTF_16BE:
          this.write(b, 0, len, Charset.forName("UTF-16BE"));
          break;
        case UTF_16LE:
          this.write(b, 0, len, Charset.forName("UTF-16LE"));
          break;
        default:
          this.write(b, 0, len, Charset.forName(encoding));
          break;
      }
    }
  }
}