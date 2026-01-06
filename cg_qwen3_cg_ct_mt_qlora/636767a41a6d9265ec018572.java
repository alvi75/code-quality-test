import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    int shift = 0;
    long result = 0;
    while (true) {
      byte b = readByte();
      result |= ((long)(b & 0x7F)) << shift;
      if ((b & 0x80) == 0) {
        return result;
      }
      shift += 7;
    }
  }
}