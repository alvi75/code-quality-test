import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    int b = in.read();
    if (b < 0) throw new EOFException();
    long result = b & 127;
    while ((b = in.read()) >= 0 && (b & 128) != 0) {
      result = (result << 7) + (b & 127);
    }
    return result;
  }
}