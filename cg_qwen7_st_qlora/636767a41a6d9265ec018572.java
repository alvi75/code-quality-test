import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64() throws IOException {
    if (bufferPos == bufferLength) {
      fillBuffer(1);
    }
    return WireFormatLite.readRawVarint64(buffer, bufferPos);
  }
}