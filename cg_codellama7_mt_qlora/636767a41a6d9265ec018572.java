import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    long result = 0;
    int shift = 0;
    while (true) {
      final byte b = readRawByte();
      result |= (long) (b & 0x7F) << shift;
      if ((b & 0x80) == 0) {
        return result;
      }
      shift += 7;
      if (shift >= 64) {
        throw InvalidProtocolBufferException.malformedVarint();
      }
    }
  }
}