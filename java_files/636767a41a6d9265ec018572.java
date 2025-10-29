import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    int b = read();
    if (b >= 0) return b;
    long result = b & 0x7F;
    for (int shift = 7; shift < 64; shift += 7) {
      b = read();
      if (b >= 0) {
        result |= (long) b << shift;
        break;
      }
      result |= (long) (b & 0x7F) << shift;
    }
    return result;
  }
}