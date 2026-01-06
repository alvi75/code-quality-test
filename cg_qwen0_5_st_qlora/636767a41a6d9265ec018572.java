import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    int bit = 0;
    long value = 0;
    while (true) {
      int b = in.read();
      if (b < 0) {
        throw new EOFException("EOF");
      }
      bit |= ((long)b & 0x7F) << bit;
      if ((b & 0x80) == 0) {
        break;
      }
    }
    return value | (bit & 0x7FL);
  }
}