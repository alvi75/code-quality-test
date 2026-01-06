import java.util.*;

public class Generated_636767a31a6d9265ec018552 {
    @Override
  public String readString() throws IOException {
    int length = readInt();
    if (length == -1) {
      return null;
    }
    byte[] bytes = new byte[length];
    readFully(bytes);
    return new String(bytes, StandardCharsets.UTF_8);
  }
}