import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray() {
    if (buffer.position() == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] bytes = new byte[buffer.position()];
    buffer.flip();
    buffer.get(bytes);
    return bytes;
  }
}