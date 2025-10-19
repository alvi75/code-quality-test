import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**
 * /**Read raw varint**/
public long readRawVarint64() throws IOException {
    int b;
    int result = 0;
    for (int shift = 0; shift < 64; shift += 7) {
      if ((b = in.read()) == -1) {
        throw new EOFException();
      }
      result |= (b & 0x7F) << shift;
      if ((b & 0x80) == 0) {
        return result;
      }
    }
    throw new RuntimeException("Invalid varint encoding.");
  }
}