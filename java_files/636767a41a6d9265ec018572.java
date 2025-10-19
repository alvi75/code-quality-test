import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    if (readBuffer == null) {
      readBuffer = new byte[1];
      int n = read(readBuffer, 0, 1);
      if (n < 0) {
        throw new CorruptEncodingException("Varint length is negative: " + n);
      }
      if ((n & 0x80) != 0) {
        return Long.MAX_VALUE;
      }
      return readBuffer[0] & 0xFF;
    } else {
      // Read from buffer.
      long v = 0;
      for (int i = 0; i < 8; ++i) {
        final byte b = readBuffer[i];
        v |= (b & 0xff) << (7 - i);
      }
      return v;
    }
  }
}