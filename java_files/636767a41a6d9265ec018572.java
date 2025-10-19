import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    byte b = this.readByte();
    if ((b & 0x80) != 0) {
      // 1-byte zig-zag encoded value.
      int shift = 7;
      long result = (long)(b & 0x7F);
      do {
        b = this.readByte();
        result |= (long)(b & 0x7FL) << shift;
        shift += 7;
      } while ((b & 0x80) != 0);
    }
    else {
      // 2-byte zig-zag encoded value.
      int shift = 14;
      long result = (long)(b & 0x7FF);
      do {
        b = this.readByte();
        result |= (long)(b & 0x7FL) << shift;
        shift += 7;
      } while ((b & 0x80) != 0);
    }
    return result;
  }
}