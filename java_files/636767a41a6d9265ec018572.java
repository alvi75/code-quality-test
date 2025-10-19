import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    int i = 0;
    byte b;
    do {
      if (i++ >= 5) throw new CorruptedTorrentException("Too many bytes in varint");
      b = readByte();
    } while ((b & 0x80) != 0);
    return (long)(b & 0x7f) |
        (((long)(readByte() & 0x7f)) << 7) |
        (((long)(readByte() & 0x7f)) << 14) |
        (((long)(readByte() & 0x7f)) << 21) |
        (((long)(readByte() & 0x1f)) << 28);
  }
}