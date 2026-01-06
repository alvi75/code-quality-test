import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    byte[] b = new byte[8];
    int i = 0;
    while (true) {
      int c = in.read();
      if (c == -1)
        throw new EOFException("Unexpected EOF reading varint");
      b[i++] = (byte)c;
      if ((c & 0x80) != 0) {
        if (i > 9)
          throw new InvalidProtocolBufferException(
              "Too many bytes for a single varint.");
        if (i < 9 && (b[i] & 0xc0) == 0x80)
          throw new InvalidProtocolBufferException(
              "Continuation cannot be followed by zero or null bits.");
        break;
      }
    }
    return decodeLong(b, 0, i);
  }
}